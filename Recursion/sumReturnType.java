package Recursion;

import java.util.Scanner;

public class sumReturnType {
    public static int sum(int n ){
        if(n==1 || n == 0) return n ;   // Base Case
        return n + sum(n-1) ;   // Call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt() ;
        System.out.println(sum(n));
        sc.close(); 
    }
}
