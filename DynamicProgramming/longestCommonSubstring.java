package DynamicProgramming;

public class longestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "ABCDGH" ;
        String s2 = "ACDGHR" ;

        int m = s1.length(), n = s2.length();
        int max = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(dp[i][j], max);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        System.out.println(max);
    }
}
