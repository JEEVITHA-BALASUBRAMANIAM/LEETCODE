class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[0] < nums[i] && nums[i] > nums[i + 1] || nums[0] > nums[i] && nums[i] < nums[i + 1]){
            count++;
            nums[0] = nums[i];
            }
        }return count;
    }
}