package Loops;

import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        // 4 7 10 13 16 . . . . . .
        // Method - 1 
        // for (int i = 4; i <= 3 * (n + 1); i += 3) {
        //     System.out.println(i);
        // sc.close();
        // }

    // an = a + (n-1) d
    // an = 4 + 3n - 3
    // an = 3n + 1

        // Method - 2
        int a = 4, d = 3;
        for (int i = 1 ; i<=n ; i++){
            System.out.println(a);
            a += d;
        sc.close();

        }
    
}

}