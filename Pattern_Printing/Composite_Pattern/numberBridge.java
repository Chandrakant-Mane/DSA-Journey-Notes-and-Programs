package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        // METHOD - 1
        n--;
        int nsp = 1;
        for (int i = 1; i <= n; i++) {                // Rows
            int a = 1 ;
            for (int j = 1; j <= n + 1 - i; j++) {    // Numbers
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= nsp; j++) {          // Spaces 
                System.out.print(" " +" ");
                a++ ;      // Very  Important 
            }
            nsp += 2;
            for (int j = 5 ; j <= n+5-i; j++) {       // Numbers
                System.out.print(a++ + " ");
            }
            System.out.println();
            a += 1;
            sc.close();

        }
    }
}
