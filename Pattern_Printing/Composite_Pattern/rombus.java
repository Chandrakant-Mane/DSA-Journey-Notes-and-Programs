package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {             // Rows
            for (int j = 1; j <= n - i; j++) {     // Spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {         // stars
                System.out.print("* ");
            }
            System.out.println();
            sc.close();

        }
    }

}
