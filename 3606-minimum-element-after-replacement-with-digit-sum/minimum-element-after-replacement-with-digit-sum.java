class Solution {
    public int minElement(int[] nums) {
        int rem=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum=0;
            int n=nums[i];
            while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
            }
            nums[i]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}