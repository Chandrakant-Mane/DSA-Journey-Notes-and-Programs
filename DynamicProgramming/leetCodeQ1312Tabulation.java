package DynamicProgramming;

public class leetCodeQ1312Tabulation {
    //       Tabulation (memoization conversion to tabulation)
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int p = (i > 0 && j > 0) ? dp[i - 1][j - 1] : 0;
                int q = (i > 0) ? dp[i - 1][j] : 0;
                int r = (j > 0) ? dp[i][j - 1] : 0;
                if (a.charAt(i) == b.charAt(j))
                    dp[i][j] = 1 + p;
                else
                    dp[i][j] = Math.max(q, r);
            }
        }
        return dp[m - 1][n - 1];
    }

    // Tabulation + Space Optimization (memoization conversion to tabulation)
    public static int longestCommonSubsequence1(String a, String b) {
        int m = a.length(), n = b.length();
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[2][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[1][j] = 1 + dp[0][j - 1];
                else
                    dp[1][j] = Math.max(dp[1][j - 1], dp[0][j]);
            }
            // Copy the 1st row to 0th row for next time
            for (int j = 0; j <= n; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n];
    }
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
    public static void main(String[] args) {
        String s = "leetcode" ;
        int lcs = longestCommonSubsequence(s, reverse(s));
        int n = s.length(); 
        System.out.println(n-lcs);

        lcs = longestCommonSubsequence1(s, reverse(s)) ;

        System.out.println(n-lcs);
    }
}
