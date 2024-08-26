class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.isEmpty() && map.containsKey(nums[i])){
                if(map.get(nums[i])==1){
                    sum-=nums[i];
                    map.put(nums[i],2);
                }
            }
            else{
                map.put(nums[i],1);
                sum+=nums[i];
            }
        }
        return sum;
    }
}