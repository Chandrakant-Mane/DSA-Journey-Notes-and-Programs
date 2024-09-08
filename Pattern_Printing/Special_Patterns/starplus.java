package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();
        int mid = n/2 + 1 ;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){

                // Method  -  1 
                if(i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                

                // if (n%2 != 0){
                //     if(j == (n/2)+1 || i == (n/2)+1)
                //     System.out.print("* ");
                //     else
                //     System.out.print("  ");}
    
            }
            System.out.println();
            sc.close();
        }
    }
}
