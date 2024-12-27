class Solution {
    public int[] twoSum(int[] nums, int target) {
     ArrayList<Integer> li=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   li.add(i);
                   li.add(j);
                }
        }
       } 
        int[] a=new int[2];
         a[0]=li.get(0);
         a[1]=li.get(1);

         return a;
    }
}