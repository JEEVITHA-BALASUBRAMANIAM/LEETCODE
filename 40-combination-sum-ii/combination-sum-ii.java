class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); 
        solve(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void solve(int[] candidates, int target, int start, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        else{
          for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;  
            }
            if (candidates[i] > target) {
                break;  
            }
            list.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, list, result);
            list.remove(list.size() - 1);
        }
        }
    }
}
