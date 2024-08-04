class Solution {
    public int findMaxK(int[] nums) {
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if (nums[i] == -nums[j])
                    return Math.abs(nums[j]);
                }
            }
       return - 1;
       
    }
}