package DynamicProgramming ;

import java.util.Arrays;

public class leetCodeQ279 {
    public static boolean isPerfect(int n) {
        int sqrt = (int) (Math.sqrt(n));
        if (sqrt * sqrt == n)
            return true;
        return false;
    }

    // Normal Recursion (TLE  Error)
    public static int numSquares(int n) {
        if (isPerfect(n))
            return 1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n / 2; i++) {
            int count = numSquares(i) + numSquares(n - i);
            min = Math.min(min, count);
        }
        return min;
    }

    // Recursion + Memoization (TLE Error) 
    public static int minSquares1(int n, int[] dp) {
        if (isPerfect(n))
            return 1;
        if (dp[n] != -1)
            return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n / 2; i++) {
            int count = minSquares1(i, dp) + minSquares1(n - i, dp);
            min = Math.min(min, count);
            dp[n] = min;
        }
        return min;
    }

    // Recursion + Memoization Optimized 
    public static int minSquares2(int n, int[] dp) {
        if (isPerfect(n))
            return 1;
        if (dp[n] != -1)
            return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int count = minSquares2(i * i, dp) + minSquares2(n - i * i, dp);
            min = Math.min(min, count);
        }
        return dp[n] = min;
    }

    public static void main(String[] args) {
        int n = 3461 ;

        int[] dp = new int[n+1] ;
        Arrays.fill(dp , -1) ;

        System.out.println(minSquares2(n, dp));

    }
}
