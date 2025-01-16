package DynamicProgramming ;
public class leetCodeQ1143Tabulation {
    //          Tabulation 
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }

    //          Space Oprimization 
    public static int longestCommonSubsequenceSO(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[2][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[1][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[1][j] = 1 + dp[0][j - 1];
                } else {
                    dp[1][j] = Math.max(dp[1][j - 1], dp[0][j]);
                }
            }
            // Copy paste
            for (int j = 0; j <= n; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n];
    }
    public static void main(String[] args) {
        String a = "abcde" ; 
        String b = "ace" ;
        System.out.println(longestCommonSubsequence(a, b));

        System.out.println(longestCommonSubsequenceSO(a, b));
    }
}
