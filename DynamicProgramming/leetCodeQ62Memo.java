package DynamicProgramming;

public class leetCodeQ62Memo {
    public static int paths(int row, int col, Integer m, Integer n, int[][] dp) {
        if (row >= m || col >= n)
            return 0;
        if (row == m - 1 && col == n - 1)
            return 1;
        if (dp[row][col] != 0)
            return dp[row][col];
        int rightWays = paths(row, col + 1, m, n, dp);
        int leftWays = paths(row + 1, col, m, n, dp);
        return dp[row][col] = rightWays + leftWays;
    }
    public static void main(String[] args) {
        // row : 0 to m-1 | col : 0 t0 n-1
        int m = 3 ;
        int n = 7 ;
        int[][] dp = new int[m][n];
        // Arrays.fill(dp , -1) ;
        System.out.println(paths(0, 0, m, n, dp));
    }
}
