class Solution {
    int[][] memo;
    int[][] val;
    int n;
    public int[] findPermutation(int[] nums) {
        n = nums.length;
        memo = new int[1<<n][n];
        val = new int[1<<n][n];
        for(int i = 0; i < (1<<n); i++) {
            for(int j = 0; j < n; j++) {
                memo[i][j] = Integer.MAX_VALUE;
            }
        }
        dfs(1, 0, nums);

        
        int[] ans = new int[n];
        int mask = 1;
        int prev = 0;
        for(int i = 1; i < n; i++) {
            prev = val[mask][prev];
            ans[i] = prev;
            mask += (1<<prev);
        }
        return ans;
    }

    public int dfs(int mask, int prev, int[] nums) {
        if(Integer.bitCount(mask)==n) { 
            return Math.abs(prev-nums[0]);
        }
        if(memo[mask][prev]!=Integer.MAX_VALUE) { 
            return memo[mask][prev];
        }
        for(int i = 0; i < n; i++) {
            if((mask&(1<<i)) == 0) { 
               
                int res = Math.abs(prev-nums[i]) + dfs(mask+(1<<i), i, nums); 
                if(res < memo[mask][prev]) { 
                    memo[mask][prev] = res;
                    val[mask][prev] = i;
                }
            }
        }
        return memo[mask][prev];
    }
}