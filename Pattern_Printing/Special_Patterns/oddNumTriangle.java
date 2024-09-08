package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class oddNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();

        // METHOD - 1

        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(2*i-1 + " ");
        //     }
        //     System.out.println();
        //     sc.close();
        // }

        // METHOD - 2

        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ; j <= 2*i-1 ; j+=2){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        //     sc.close();
        // }

        // METHOD - 3

        for(int i = 1 ; i <= n ; i++){
            int a = 1 ;
            for(int j = 1 ; j <= i; j++){
                System.out.print(a+ " ");
                a += 2 ;
            }
            System.out.println();
            sc.close();
        }
    }
    
}
