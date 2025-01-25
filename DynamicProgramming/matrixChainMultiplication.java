package DynamicProgramming;

public class matrixChainMultiplication {
            //  2-D  Array 
     // Recursion + Memoization 
    public static int mcm(int i , int j , int[][] arr , int[][] dp){
        if(i==j)    
            return 0 ;
        if(dp[i][j] != -1 )  
            return dp[i][j] ;
        int minCost = Integer.MAX_VALUE ;
        for(int k = i ; k < j ; k++){
            int x = arr[i][0] * arr[k][1] * arr[j][1] ;
            int totalCost = mcm(i , k , arr , dp) + mcm(k+1 , j , arr , dp) + x ;
            minCost = Math.min(minCost , totalCost) ;
        }
        return dp[i][j] = minCost ;

    }
        //      Tabulation 
    public static int mcm2(int[][] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0 ; j <= n-1 ; j++){
                if (i == j){
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int x = arr[i][0] * arr[k][1] * arr[j][1];
                    int totalCost = dp[i][k] + dp[k+1][j] + x;
                    minCost = Math.min(minCost, totalCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[0][n-1] ;
    }
    public static void main(String[] args) {
        int[][] arr = { {1 , 2} , {2 , 3} , {3 , 4} , {4 , 2} } ;
        int n = arr.length ;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(mcm(0 , n-1 , arr , dp));
        System.out.println(mcm2(arr));

    }
}
