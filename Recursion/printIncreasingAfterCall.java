package Recursion;

import java.util.Scanner;

public class printIncreasingAfterCall {
    public static void print(int n) {
        if (n == 0) // Base Case
            return;
        // System.out.println(n); // Work
        print(n - 1); // Call
        System.out.println(n); // Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n  : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
