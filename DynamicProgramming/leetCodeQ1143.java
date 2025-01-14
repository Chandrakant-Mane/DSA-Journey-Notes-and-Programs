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

    }
}
