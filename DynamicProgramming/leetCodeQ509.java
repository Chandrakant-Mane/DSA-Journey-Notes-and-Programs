package DynamicProgramming;

public class leetCodeQ509 {
    public static int fibo(int n , int[] dp){
        if(n <= 1) return n ;
        if(dp[n] != 0) return dp[n] ;  // New 
        return dp[n] = fibo(n-1 , dp) + fibo(n-2 , dp) ;  // New 
    }
    public static void main(String[] args) {
        int n = 10 ;
        int[] dp = new int[n+1] ;
        System.out.println(fibo(n, dp));

    }
}
