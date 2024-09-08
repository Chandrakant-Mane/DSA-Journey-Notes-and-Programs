package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class floydstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        int a = 1 ;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(a++ + " "); // PostIncrement Operator 
                // a++ ;
                
            }
            System.out.println();
            sc.close();
        }
    }
    
}
