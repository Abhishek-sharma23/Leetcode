class Solution {
    public double myPow(double x, int n) {
        double a=1;
        long b=n;
        if(b<0) 
            b=-b;
        while(b>0) 
        {
            if(b%2==1) a=a*x;
            x=x*x;
            b=b/2;
        }
        if(n<0) 
            a=1/a;
        return a;
    }
}