package Loops;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = sc.nextInt();
        int a = 3 , d = 4 ;
        for (int i = 3; i <= n; i++) {
            System.out.println(a);
            a *= d ;
        sc.close();
            
        }
    }
    
}
