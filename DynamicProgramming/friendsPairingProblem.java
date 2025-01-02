package DynamicProgramming ;

import java.util.Scanner;

public class friendsPairingProblem {
    // Recursion Code .
    public static int pair(int n){
        if(n <= 2) return n ;
        return pair(n-1) + (n-1)*pair(n-2) ;
    }

    // Memoization Code . 
    public static long pairMemo(int n , int[] dp) {
        if (n <= 2)
            return n;
        if(dp[n] != 0) return dp[n] ;
        return dp[n] = (int) (pairMemo(n - 1 , dp) + (n - 1) * pairMemo(n - 2 , dp));
    }

    // Tabulation 
    public static int pairTabu(int n){
        int[] dp = new int[n+1] ;
        if(n > 0 ) 
            dp[1] = 1 ; 
        if(n > 1) 
            dp[2] = 2 ;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i-1] + (i-1) * dp[i-2] ;
        }
        return dp[n] ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        System.out.print("Recursion : ");
        System.out.println(pair(n)); 
 
        System.out.print("Memoization : ");

        int[] dp = new int[n+1] ;
        System.out.println(pairMemo(n, dp));

        System.out.print("Tabulation : ");
        System.out.println(pairTabu(n));
        sc.close();
    }
}
