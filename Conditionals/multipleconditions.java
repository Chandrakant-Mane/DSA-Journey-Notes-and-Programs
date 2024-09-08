package Conditionals;

import java.util.Scanner;

public class multipleconditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = scan.nextInt();

        if (n > 99 && n < 1000) // && and || are logical operators
            System.out.println(n + " is three digit number");
        else
            System.out.println(n + " is Not three digit number");

        scan.close();

    }
}
