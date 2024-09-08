package Conditionals;

import java.util.Scanner;

public class nestedifelse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        int a = scan.nextInt();
        System.out.print(" Enter Second Number : ");
        int b = scan.nextInt();
        System.out.print(" Enter Third Number : ");
        int c = scan.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println(a + " is Largest ");
            else
                System.out.println(c + " is Largest ");
        }
        else{
            if(b > c) 
                System.out.println(b+ " is Largest ");
            else
                System.out.println(c+ " is Largest ");
        }

        scan.close();
        

    }

}
