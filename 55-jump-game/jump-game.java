class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int i,m=0;
        for(i=0;i<=n-1;i++){
            if(i>m){
             return false;
        }
        m=Math.max(m,i+nums[i]);
        }
        return true;
    }
}