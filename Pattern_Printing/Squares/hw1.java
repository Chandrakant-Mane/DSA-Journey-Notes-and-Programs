package Pattern_Printing.Squares;

import java.util.Scanner;

public class hw1 {
    // Alphabet Square 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        // int m ;
        // char x = 0 ;

        for(int i = 1; i <= n; i++){
            // m = 65 ;
            for(int j = 1; j <= n; j++){
                // x = (char) (j+64) ;
                System.out.print((char) (j+64)+ " ");
                // m += 1 ;
            }
            System.out.println();
            sc.close();
        }
        
    }
    
}
