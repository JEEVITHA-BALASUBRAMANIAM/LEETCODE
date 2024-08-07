class Solution {
    public int solve(int[] coins,int i,int j,int dp[][])
    {
        if(j==0)
        {
            return 1;
        }
        if(i==0)
        {
            if(j%coins[0]==0)
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        } 
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int take=0; 
        int not_take = solve(coins,i-1,j,dp); 
        if(coins[i]<=j)
        {
            take = solve(coins,i,j-coins[i],dp);
        }
        dp[i][j]=take+not_take; 
        return dp[i][j];
    }
    public int change(int amount, int[] coins) {
           
          int n = coins.length;
          int[][] dp = new int[n][amount+1]; 
          int i,j; 
          for(i=0;i<=n-1;i++)
          {
            for(j=0;j<=amount;j++)
            {
                if(j==0)
                {
                    dp[i][j] =1;
                }
                else if(i==0)
                {
                    if(j%coins[i]==0)
                    {
                        dp[i][j] =1;
                    }
                    else 
                    {
                        dp[i][j] = 0;
                    }
                }
                else 
                {
                    int take=0; 
        int not_take = dp[i-1][j]; 
        if(coins[i]<=j)
        {
            take =dp[i][j-coins[i]];
        }
            dp[i][j]=take+not_take;
                }
            }
          }
          return dp[n-1][amount];

    }
}