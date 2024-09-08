package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class binarytriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                // METHOD - 1

                // if (i % 2 == 1) {
                // if (j % 2 == 1)
                // System.out.print("1 ");
                // else
                // System.out.print("0 ");
                // }
                // else {
                // if (j % 2 == 0)
                // System.out.print("1 ");
                // else
                // System.out.print("0 ");
                // }

                // METHOD - 2
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");

            }
            System.out.println();
            sc.close();
        }
    }

}
