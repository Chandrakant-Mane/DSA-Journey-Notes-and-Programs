package Conditionals;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = scan.nextInt();

        if (n % 2 == 0)
            System.out.println("EVEN");
        if (n % 2 == 1)
            System.out.println("ODD");
        


        if (n % 2 == 0)
            System.out.println("EVEN");
        else 
            System.out.println("ODD"); 
        
        scan.close();

        


    }

}
