package Recursion;

import java.util.Scanner;

public class sum1ToN {
    public static void sum(int n ,int s ){
        if(n==0){   // Base Case 
            System.out.println(s);
            return ;
        }
        sum(n-1, s+n);    // Call And Work 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;
        sum(n,0);
        sc.close(); 
    }
}
