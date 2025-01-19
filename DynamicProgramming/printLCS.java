package DynamicProgramming ;

public class printLCS {
    public static int[][] longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        // i = m-1 to 0 | j = n-1 to 0
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp ;
    }
    public static void main(String[] args) {
        String a = "abcde" ;
        String b = "fabgdk" ;

        int m = a.length() ; 
        int n = b.length() ;

        int[][] dp = longestCommonSubsequence(a, b) ;

        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int i = m , j = n ;
        StringBuilder ans = new StringBuilder() ;

        while(i > 0 && j > 0){
            if(a.charAt(i-1) == b.charAt(j-1)){
                ans.append(a.charAt(i-1)) ;
                i-- ; j-- ;
            }
            else{
                if(dp[i-1][j] >= dp[i][j-1] ) 
                    i-- ;
                else 
                    j-- ;
            }
        }
        System.out.println(ans);
        System.out.println(ans.reverse());

    }
}
