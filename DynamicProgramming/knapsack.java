package DynamicProgramming;

public class knapsack {
            //Recursion + Memoization  T.C & A.S  ==>  O(n * C) 
    public static int profit(int i , int[] wt , int[] val , int C  , int[][] dp){
        if( i == wt.length ) 
            return 0 ;
        if(dp[i][C] != -1) 
            return dp[i][C] ;
        int skip = profit(i + 1, wt, val, C , dp);
        if(wt[i] > C) 
            return dp[i][C] =  skip ;
        int take = val[i] + profit(i+1, wt, val, C-wt[i] , dp) ;
        return dp[i][C] = Math.max(take, skip) ;
    }
    public static void main(String[] args) {
        int[] val = { 5 , 3 , 7 , 16} ;
        int[] wt = { 1 , 2 , 8 , 10} ;
        int C = 8 ;
        int n = wt.length ;
        // i = 0 to n-1  |  C = C to 0 
        int[][] dp = new int[n][C+1] ;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1 ;
            }
            
        }
        System.out.println(profit(0 , wt, val, C , dp));

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }

        }
        
        //      Tabulation 

        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < C+1 ; j++){
                int skip = (i > 0) ? dp[i-1][j] : 0 ;
                if (wt[i] > j)
                    dp[i][j] = skip ;
                else{
                    int take = val[i];
                    take += (i > 0) ? dp[i - 1][j - wt[i]] : 0;
                    dp[i][j] = Math.max(take, skip);
                }
                

            }
        }

        System.out.println(dp[n-1][C]); 
         
    }
}
