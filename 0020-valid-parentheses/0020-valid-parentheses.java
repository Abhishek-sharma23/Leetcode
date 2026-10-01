class Solution {
    public boolean isValid(String s) {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                a+=ch;
            }
            else
            {
                if(a.length()==0) return false;
                char top=a.charAt(a.length()-1);
                if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='[')
                    return false;
                a=a.substring(0,a.length()-1);
            }
        }
        return a.length()==0;
    }
}