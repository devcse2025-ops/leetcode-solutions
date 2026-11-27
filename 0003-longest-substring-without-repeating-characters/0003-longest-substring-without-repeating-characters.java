class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int count=0;
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            while(set.contains(ch))
            {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            count=Math.max(count,j-i+1);
        }
        return count;
    }
}