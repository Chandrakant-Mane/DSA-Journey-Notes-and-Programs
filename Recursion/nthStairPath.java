package Recursion;

import java.util.Scanner;

public class nthStairPath {
    public static int stair(int n){
        if(n<=2) return n ;
        // if(n==1) return 1 ;
        // if(n==2) return 2 ;
        return stair(n-1) + stair(n-2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter n : ");
        int n = sc.nextInt() ;
        System.out.println(stair(n));
        sc.close();  

        // Home Work is solve same question for 1 & 3 jumps .
    }
}
