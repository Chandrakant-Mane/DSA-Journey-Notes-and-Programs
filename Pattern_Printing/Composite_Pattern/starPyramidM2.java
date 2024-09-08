package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class starPyramidM2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" Enter n : ");
            int n = sc.nextInt();
            int nsp = n-1 ;
            int nst = 1 ;

            for (int i = 1; i <= n; i++) {             // Rows
                for (int j = 1; j <= nsp ; j++) {     // Spaces
                    System.out.print("  ");
                }
                for (int j = 1; j <= nst ; j++) {     // stars
                    System.out.print("* ");
                }
                System.out.println();
                nsp-- ;
                nst += 2 ;
                sc.close();
    
            }
        }
    }