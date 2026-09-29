class Solution {
    int[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == ')') {
            return false;
        }

        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        dp = new int[m][n][m + n];

        return check(grid, 0, 0, 0);
    }

    public boolean check(char[][] grid, int row, int col, int count) {

        if (grid[row][col] == '(') {
            count++;
        } else {
            count--;
        }

        if (count < 0) {
            return false;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return count == 0;
        }

        if (dp[row][col][count] != 0) {
            return dp[row][col][count] == 1;
        }

        boolean result = false;

        if (row + 1 < grid.length) {
            result = check(grid, row + 1, col, count);
        }

        if (!result && col + 1 < grid[0].length) {
            result = check(grid, row, col + 1, count);
        }

        if (result) {
            dp[row][col][count] = 1;
        } else {
            dp[row][col][count] = -1;
        }

        return result;
    }
}