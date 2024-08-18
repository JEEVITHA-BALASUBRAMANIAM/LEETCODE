class Solution {
    public int[] productExceptSelf(int[] nums) {
       int res[] = new int[nums.length];
        res[0] = 1;
        for (int i=1; i<nums.length; i++) {
            res[i] = res[i-1]*nums[i-1];
        }
        int prev = 1;
        for (int i=nums.length-1; i>-1; i--) {
            res[i] = prev*res[i];
            prev = prev*nums[i];
        }
        return res;
    }
}