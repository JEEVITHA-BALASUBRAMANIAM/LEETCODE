class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long evenSum = 0;
        long oddSum = 0;

        for (int i = 0; i < n; i++) {
            long newEvenSum = Math.max(evenSum, oddSum + nums[i]);
            long newOddSum = Math.max(oddSum, evenSum - nums[i]);
    
            evenSum = newEvenSum;
            oddSum=newOddSum;
        }
        return evenSum;
    }
}