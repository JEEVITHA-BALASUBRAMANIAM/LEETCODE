class Solution {
    public int lengthOfLIS(int[] nums)
    {
        int n = nums.length;
        int[] LIS = new int[n]; 
        int i,j; 
        for(i=0 ; i<=n-1 ;i++)
        {
            LIS[i] = 1;
        }
       for(i=1 ; i<=n-1 ;i++)
       {
        for(j = 0 ; j<=i-1 ; j++)
        {
              if(nums[i] > nums[j])
              {
                 LIS[i] = Math.max(LIS[i], LIS[j]+1); 
              }
        }
       }
       int max = 0 ;
for(i=0 ; i<=n-1 ; i++)
       {
         if(max <LIS[i])
         {
            max = LIS[i];
         }
       }
     return max;
    }
}