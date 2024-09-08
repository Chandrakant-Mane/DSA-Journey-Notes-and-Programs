package Recursion;

import java.util.Scanner;

public class printIncreasing {
                // M - 1  Using Extra Parameter  
    public static void print(int x , int n) {
        if (x>n)            // Base Case
            return ;
        System.out.println(x);   // Work 
        print(x + 1 , n);         // Call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n  : ");
        int n = sc.nextInt();
        print(1 , n);
        sc.close();
    }

                //  M - 2  Using Global Variable  
    // static int n ; // Global Varible   (We don't prefer to use this)
    // public static void print(int x ) {
    //     if (x>n)            // Base Case
    //         return ;
    //     System.out.println(x);   // Work 
    //     print(x + 1);         // Call
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter  n  : ");
    //     n = sc.nextInt();
    //     print(1 );
    //     sc.close();
    // }
}
