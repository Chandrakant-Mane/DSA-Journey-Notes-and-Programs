package Conditionals;

import java.util.Scanner;

public class hw4 {

    // Take 3 positive integers input and
    // print the least of them.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        int a = scan.nextInt();
        System.out.print(" Enter Second Number : ");
        int b = scan.nextInt();
        System.out.print(" Enter Third Number : ");
        int c = scan.nextInt();

        // if(a>=b && a>=c)
        // System.out.println(a+ " is Least ");
        // if(b>=a && b>=c)
        // System.out.println(b+ " is Least ");
        // if(c>=a && c>=b)
        // System.out.println(c+ " is Least ");

        if (a <= b && a <= c)
            System.out.println(a + " is Least ");
        else if (b <= a && b <= c)
            System.out.println(b + " is Least ");
        else
            System.out.println(c + " is Least ");

        scan.close();
    }

}
