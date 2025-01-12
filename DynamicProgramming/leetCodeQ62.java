package DynamicProgramming;

public class leetCodeQ62 {
    public static void main(String[] args) {
        int m =  3 ;
        int n =  7 ;
        int[][] dp = new int[m][n];

        // Tabulation S.C = O(m*n) 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        System.out.println(dp[m - 1][n - 1]);

        // Tabulation Optimized S.C = O(n)

        int[][] dp1 = new int[2][n];
        for (int j = 0; j < n; j++) {
            dp1[0][j] = 1;
            dp1[1][j] = 1;
        }
        for (int i = 1; i <= m - 1; i++) { // m-1 times ;
            // DP wala kaam
            for (int j = 1; j < n; j++) {
                dp1[1][j] = dp1[1][j - 1] + dp1[0][j];
            }
            // copy the first row to 0th row
            for (int j = 1; j < n; j++) {
                dp1[0][j] = dp[1][j];
            }
        }

        System.out.println(dp1[1][n-1]); 

        // Tabulation Optimised S.C = O(n)
        // Without Copy Pasting 
        for (int j = 0; j < n; j++) {
            dp1[0][j] = 1;
            dp1[1][j] = 1;
        }
        for (int i = 1; i <= m - 1; i++) { // m-1 times ;
            if (i % 2 == 1) {
                for (int j = 1; j < n; j++) {
                    dp1[1][j] = dp1[1][j - 1] + dp1[0][j];
                }
            } 
            else {
                for (int j = 1; j < n; j++) {
                    dp1[0][j] = dp1[0][j - 1] + dp1[1][j];
                }
            }
        }
        System.out.println(Math.max(dp1[1][n - 1], dp1[0][n - 1]));

    }
}
