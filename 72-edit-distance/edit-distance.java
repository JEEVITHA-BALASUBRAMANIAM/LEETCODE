class Solution {
    public int solve(String word1, String word2, int i, int j,int[][] dp) {
        
        if (i < 0) {
            return j + 1; 
        }
        if (j < 0) {
            return i + 1; 
        }
        
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        if (word1.charAt(i) == word2.charAt(j)) {
           dp[i][j] = solve(word1, word2, i - 1, j - 1,dp);
        } else {
            int ins = solve(word1, word2, i, j - 1,dp);
            int del = solve(word1, word2, i - 1, j,dp);
            int rep = solve(word1, word2, i - 1, j - 1,dp);
           dp[i][j] = 1 + Math.min(ins, Math.min(del, rep));
        }
        
        return dp[i][j];
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
       int[][] dp = new int[m][n];
        
        
        for (int i=0;i<m;i++) {
           for(int j=0;j<n;j++){
            dp[i][j]=-1;
           }
        }
        
        return solve(word1, word2, m - 1, n - 1,dp);
    }
}
