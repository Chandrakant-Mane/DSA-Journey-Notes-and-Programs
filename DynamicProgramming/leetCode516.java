package DynamicProgramming;

public class leetCode516 {
            // Recursion + Memoization
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

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs(m - 1, n - 1, a, b, dp);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
    public static void main(String[] args) {
        String s = "bbbab" ;
        System.out.println(longestCommonSubsequence(s , reverse(s)));
    }
}
