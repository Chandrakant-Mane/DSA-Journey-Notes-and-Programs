package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class flippedTriangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if((j+i) > n)
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println();
            sc.close();
        }
    }
}
