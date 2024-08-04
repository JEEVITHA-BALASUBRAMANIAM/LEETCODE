class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums.length % (i + 1) == 0)
                sum += nums[i] * nums[i];
        return sum;
    }
}