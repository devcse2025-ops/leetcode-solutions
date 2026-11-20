class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        int n=nums1.length+nums2.length;
        while(i<nums1.length && j<nums2.length)
        {
        if(nums1[i]>nums2[j])
        {
            arr[k]=nums2[j];
            j++;
        }
        else
        {
            arr[k]=nums1[i];
            i++;
        }
        k++;
        }
            while(j<nums2.length)
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
            while(i<nums1.length)
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
        if(n%2==0)
        {
            return (float)(arr[n/2]+arr[n/2-1])/2;
        }
        else
        {
            return (float)arr[n/2];
        }
    }
}