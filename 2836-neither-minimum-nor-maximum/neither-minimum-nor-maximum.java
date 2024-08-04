class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       
        if(n==1||n==2){
            return -1;
                    }
        else{
            return nums[1];
        }
    }
}