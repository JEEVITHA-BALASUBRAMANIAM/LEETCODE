class Solution {
    public void solve(int[] nums,List<List<Integer>> result ,int start,int end){
        if(start==end){
            List<Integer> List=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                List.add(nums[i]);
            }
            result.add(List);
            return;
        
    }
    else{
        for(int i=start ;i<=end;i++){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            solve(nums,result,start+1,end);
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
    }
    }
        public  List<List<Integer>> permute (int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        solve(nums,result,0,nums.length-1);
        return result;
    }
}