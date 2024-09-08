package Recursion;

import java.util.Scanner;

public class factorialOfN {
    public static int fact(int n ){
        if(n==1 || n == 0) return 1 ;   // Base Case
        int ans = n * fact(n-1);  // Call
        return ans ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt() ;
        System.out.println(fact(n));
        sc.close(); 
    }
}
