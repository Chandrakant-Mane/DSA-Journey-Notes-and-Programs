package DynamicProgramming ;

public class leetCodeQ1143 {

    //      Normal Recursion 
    public static int lcs(int i, int j, StringBuilder a, StringBuilder b) {
        if (i < 0 || j < 0)
            return 0;
        if (a.charAt(i) == b.charAt(j))
            return 1 + lcs(i - 1, j - 1, a, b);
        else
            return Math.max(lcs(i, j - 1, a, b), lcs(i - 1, j, a, b));
    }

    //      Recursion + Memoization 
    public static int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (a.charAt(i) == b.charAt(j))
            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b, dp);
        else
            return dp[i][j] = Math.max(lcs(i, j - 1, a, b, dp), lcs(i - 1, j, a, b, dp));
    }
    
    //              JUST CONVERT MEMOIZATION TO TABULATION .
    //      Tabulation ( Avoiding base Cases by creating (m+1 , n+1) dp)
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
    //         Space Optimization .
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
    public static void main(String[] args) {
        String text1 = "abcde" ;
        String text2 = "ace" ;
        int m = text1.length() ;
        int n = text2.length() ;
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);

        System.out.println(lcs( m-1 , n-1 , a, b));

        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(m-1, n-1, a, b , dp));

        System.out.println(longestCommonSubsequence(text1, text2));

        System.out.println(longestCommonSubsequence1(text1, text2));


    }
}
