package DynamicProgramming;

public class longestCommonSubstringSO {
    // Space Optimization .
    public static int longestCommonSubstr(String s1, String s2) {
        // code here
        int m = s1.length(), n = s2.length();
        int max = 0;
        int[][] dp = new int[2][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[1][j] = 1 + dp[0][j - 1];
                    max = Math.max(dp[1][j], max);
                } else {
                    dp[1][j] = 0;
                }
            }
            // Copy Paste 
            for (int j = 0; j <= n; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s1 = "ABCDGH" ;
        String s2 = "ACDGHR" ;

        System.out.println(longestCommonSubstr(s1, s2));
    }
}
