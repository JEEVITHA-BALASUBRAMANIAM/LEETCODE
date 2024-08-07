class Solution {
   
     public static int solve(int[] coins,int i,int j,int[][] dp)
    {
        if(i==0)
        {
            if(j%coins[0]==0)
            {
                return j/coins[i]; 
            }
            else 
            {
                return Integer.MAX_VALUE/2;
            }
        } 
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int take=Integer.MAX_VALUE/2,not_take; 
        not_take = 0 + solve(coins,i-1,j,dp); 
        if(coins[i]<=j)
        {
            take = 1+solve(coins,i,j-coins[i],dp); 
        }
           dp[i][j] = Math.min(take,not_take);  
    

           return dp[i][j]; 
    }
        public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        int result = solve(coins, n - 1, amount, dp);
        if (result == Integer.MAX_VALUE / 2){
            return -1;
        }
        else 
        return result;
    }
       
    }
