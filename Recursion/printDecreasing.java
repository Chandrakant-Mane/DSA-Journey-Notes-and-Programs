package Recursion;

import java.util.Scanner;

public class printDecreasing {
    public static void print(int n) {
        if(n == 0) return ;    // Base Case
        System.out.println(n);   // Work 
        print(n-1);    // Call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n  : ");
        int n = sc.nextInt() ;
        print(n);
        sc.close();
    }
}
