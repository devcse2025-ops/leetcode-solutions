class Solution {
    public String replaceDigits(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                str.append((char)(s.charAt(i-1)+(ch-'0')));
            }
            else
            {
                str.append(ch);
            }
        }
        return str.toString();
    }
}