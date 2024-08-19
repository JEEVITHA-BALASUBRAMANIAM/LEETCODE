class Solution {
    public int singleNumber(int[] nums) {
       int count=1;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],count);
        }
        else{
           map.put(nums[i],map.get(nums[i])+1);
        }
       }
       int k=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1)
             k=i;
        }
        return nums[k];
    }
}