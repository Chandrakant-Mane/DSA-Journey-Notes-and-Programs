package DynamicProgramming;

public class leetCodeQ63 {

            // Memoization 
    public static int paths(int row, int col, int m, int n, int[][] arr) {
        if (row >= m || col >= n)
            return 0;
        if (arr[row][col] == -1)
            return 0;
        if (row == m - 1 && col == n - 1)
            return 1;
        if (arr[row][col] != 0)
            return arr[row][col];
        int rightWays = paths(row, col + 1, m, n, arr);
        int leftWays = paths(row + 1, col, m, n, arr);
        return arr[row][col] = rightWays + leftWays;
    }

            // Tabulation 
    public static int uniquePathsWithObstacles(int[][] dp) {
        int m = dp.length ;
        int n = dp[0].length ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(dp[i][j] == 1) 
                    dp[i][j] = 0 ;
                else if(i == 0 && j == 0)
                    dp[i][j] = 1 ;
                else{
                    int right = 0 , left = 0 ;
                    if(i > 0 )
                        right = dp[i-1][j] ;
                    if(j > 0 )
                        left = dp[i][j-1]; 
                    dp[i][j] = right + left ;
                }    
            }
        }

        return dp[m-1][n-1] ;
    }
    public static void main(String[] args) {
        int[][] obstacleGrid = { { 0, 0, 0 } , { 0, 1, 0 } , { 0, 0, 0 }} ;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        System.out.println(uniquePathsWithObstacles(obstacleGrid));

        int[][]  obstacleGridT = {{0,0,0},{0,1,0},{0,0,0}} ;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGridT[i][j] == 1)
                    obstacleGridT[i][j] = -1;
            }
        }
        System.out.println(paths(0, 0, m, n, obstacleGridT));

    }
}
