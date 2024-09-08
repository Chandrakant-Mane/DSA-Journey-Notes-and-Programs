package Loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        // 1 3 5 7 9 . . . . . .
        for (int i = 1; i <= 2 * (n - 1); i += 2) {
            System.out.println(i);
        sc.close();
        }

        // an = a + (n-1)d
        // an = 1 + (n-1)2
        // an = 1 + 2n-2
        // an = 2n - 1

    }

}
