package Conditionals;

import java.util.Scanner;

public class hw3 {

    // Take positive integer input and tell if it is
    // a five digit number or not
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = scan.nextInt();

        if (n > 9999 && n < 100000) // && and || are logical operators
            System.out.println(n + " is Five digit number");
        else
            System.out.println(n + " is Not Five digit number");

        scan.close();

    }

}
