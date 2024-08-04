class Solution {
  public int thirdMax(int[] nums) {
    long m1=nums[0];
    long m2=Long.MIN_VALUE;
    long m3=Long.MIN_VALUE;
    for(int i=1;i<nums.length;i++){
        if(nums[i]>m1){
            m3=m2;
            m2=m1;
            m1=nums[i];
        }
        else if(nums[i]>m2 && m1>nums[i]){
            m3=m2;
            m2=nums[i];
        }
        else if(nums[i]>m3 && m2>nums[i]){
            m3=nums[i];
        }

    }
    return m3 != Long.MIN_VALUE ? (int) m3 : (int) m1;
  }
}

