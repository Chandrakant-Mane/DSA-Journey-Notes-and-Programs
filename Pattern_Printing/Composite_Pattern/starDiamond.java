package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {          // Rows 
            for (int j = 1; j <= nsp; j++) {    // Spaces 
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {    // Stars 
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;
            System.out.println();
            sc.close();
        }
        nsp = 1;
        nst = nst - 4;
        for (int i = 1; i <= n-1 ; i++) {      // Rows 
            for (int j = 1; j <= nsp; j++) {   // Spaces 
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {   // Stars 
                System.out.print("*" + " ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
            sc.close();
        }
    }
}
