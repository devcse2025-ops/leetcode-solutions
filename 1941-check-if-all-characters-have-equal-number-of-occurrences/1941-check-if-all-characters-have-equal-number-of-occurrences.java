class Solution {
    public boolean areOccurrencesEqual(String s) {
        int f[]=new int[26];
        for(char ch:s.toCharArray())
        {
            f[ch-'a']++;
        }
        int m=f[s.charAt(0)-'a'];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(f[ch-'a']!=0)
            {
                if(f[ch-'a']!=m)
                {
                    return false;
                }
            }
        }
        return true;
    }
}