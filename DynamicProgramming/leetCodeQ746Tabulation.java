package DynamicProgramming;

public class leetCodeQ746Tabulation {
    public static void main(String[] args) {
        int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 } ;
        int n = cost.length;
        // n is going from n-1 to 0
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        System.out.println(Math.min(dp[n - 1], dp[n - 2]));
    }
}
