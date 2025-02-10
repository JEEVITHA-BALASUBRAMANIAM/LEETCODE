class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] a=new int[2];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    l.add(nums[i]);
                }                 
            }
        }      
        int count=0;
        for(int f:l){
            a[count++]=f;
        }
        
          return a;
    }
}