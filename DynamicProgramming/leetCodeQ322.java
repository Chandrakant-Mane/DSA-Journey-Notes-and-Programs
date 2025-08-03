package DynamicProgramming;

public class leetCodeQ322 {
    //      Recursion + Memoization .
    public static long coin(int[] coins, int amount, int i, long[][] dp) {
        if (i == -1) {
            if (amount == 0) {
                return 0; // No More Coins Needed
            } else
                return Integer.MAX_VALUE; // Not A Valid Combination
        }
        if (dp[i][amount] != -1)
            return dp[i][amount];
        // if (amount < 0)  Not Needed
        //     return 0;
        long skip = coin(coins, amount, i - 1, dp);
        if (amount - coins[i] < 0)
            return dp[i][amount] = skip;
        long pick = 1 + coin(coins, amount - coins[i], i, dp);
        return dp[i][amount] = Math.min(skip, pick);

    }
    //      Tabulation 
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                long skip = (i > 0) ? dp[i - 1][j] : ((j == 0) ? 0 : Integer.MAX_VALUE);
                if (j - coins[i] < 0)
                    dp[i][j] = skip;
                else {
                    long pick = 1 + dp[i][j - coins[i]];
                    dp[i][j] = Math.min(skip, pick);
                }
            }
        }
        int ans = (int) dp[n - 1][amount];
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
    //      Space Optimization 
    public static int coinChangeSO(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[2][amount + 1]; // i-1 : 0 & i = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                long skip = (i > 0) ? dp[0][j] : ((j == 0) ? 0 : Integer.MAX_VALUE);
                if (j - coins[i] < 0)
                    dp[1][j] = skip;
                else {
                    long pick = 1 + dp[1][j - coins[i]];
                    dp[1][j] = Math.min(skip, pick);
                }
            }
            // Copy Paste 1st row to 0th row
            for (int j = 0; j < dp[0].length; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        int ans = (int) dp[1][amount];
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 } ;
        int amount = 11 ;
        int n = coins.length;
        System.out.println(coinChange(coins , amount));
        System.out.println(coinChangeSO(coins , amount));
        long[][] dp = new long[n][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = (int) coin(coins, amount, n - 1, dp);
        if (ans == Integer.MAX_VALUE)
            System.out.println(-1);
        System.out.println(ans);

    }
}
