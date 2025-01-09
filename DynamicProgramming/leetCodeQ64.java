package DynamicProgramming;

public class leetCodeQ64 {
            // Tabulation  
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int[][] dp = new int[m][n] ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0)
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                else if (j == 0)
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                else
                    grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

            // Memoization 
    public static int paths(int row , int col , int m , int n , int[][] grid , int[][] dp){
        if(row >= m || col >= n) return Integer.MAX_VALUE ;
        if(row == m-1 && col == n-1) return grid[row][col] ;
        if(dp[row][col] != 0) return dp[row][col] ;
        int rightWays = paths(row , col+1 , m , n , grid , dp) ;
        int leftWays = paths(row+1 , col , m , n , grid , dp) ;
        return dp[row][col] = grid[row][col] + Math.min(rightWays , leftWays) ;
    }   
    public static void main(String[] args) {
        int[][] grid = { { 1, 3, 1 } , { 1, 5, 1 } , { 4, 2, 1 }} ;
        int row = grid.length;
        int col = grid[0].length;

        
        System.out.println(paths(0, 0, row, col, grid, new int[row][col]));
        System.out.println(minPathSum(grid));
        
    }
}
