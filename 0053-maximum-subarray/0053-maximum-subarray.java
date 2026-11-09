class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            count=count+nums[i];
            max=Math.max(count,max);
             if(count<0)
            {
                count=0;
            }
        }return max;
    }
}