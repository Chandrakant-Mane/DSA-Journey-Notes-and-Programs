package Conditionals;

import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        int a = scan.nextInt();
        System.out.print(" Enter Second Number : ");
        int b = scan.nextInt();
        System.out.print(" Enter Third Number : ");
        int c = scan.nextInt();

        // if(a>=b && a>=c) 
        //     System.out.println(a+ " is Greatest ");
        // if(b>=a && b>=c) 
        //     System.out.println(b+ " is Greatest ");
        // if(c>=a && c>=b) 
        //     System.out.println(c+ " is Greatest ");


        if(a>=b && a>=c) 
            System.out.println(a+ " is Greatest ");
        else if(b>=a && b>=c) 
            System.out.println(b+ " is Greatest ");
        else
            System.out.println(c+ " is Greatest ");

    

        scan.close();
    }
    
}
