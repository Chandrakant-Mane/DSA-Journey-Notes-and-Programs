package DynamicProgramming ;

public class leetCodeQ509Tabulation {
    
    // SC :- O(n)
    public static int fib(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Most Optimized  SC :- O(1) ;
    public static int fib1(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 1; i <= n - 1; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
    
    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib1(8));
    }
}
