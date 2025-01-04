package DynamicProgramming;

public class leetCodeQ279Tabulation {
    public static boolean isPerfect(int n) {
        int sqrt = (int) (Math.sqrt(n));
        return (sqrt * sqrt == n);
    }

    // Tabulation   TC = O(n*n)  It will be submited .
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i))
                dp[i] = 1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i/2; j++) {
                    int count = dp[j * j] + dp[i - j * j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }

    // Tabulation   TC = O(n* root n)
    public static int numSquares1(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i))
                dp[i] = 1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
                    int count = dp[j * j] + dp[i - j * j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3461 ;
        System.out.println(numSquares(n));

        System.out.println(numSquares1(n));
    }
}
