class Solution {
    public String longestCommonPrefix(String[] v) {
        String ans="";
        for(int i=0;i<v[0].length();i++)
        {
            char ch=v[0].charAt(i);
            for(int j=1;j<v.length;j++)
            {
                if(i>=v[j].length()||v[j].charAt(i)!=ch)
                    return ans;
            }
            ans+=ch;
        }
        return ans;
    }
}