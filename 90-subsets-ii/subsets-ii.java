class Solution {
    public void solve(int[] nums, List<List<Integer>> result, List<Integer> list, int index) {
        result.add(new ArrayList<>(list)); 
        
            for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) 
            continue;
            
            list.add(nums[i]); 
            solve(nums, result, list, i +1); 
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> List=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,result,List,0);
        return result;
    }
}