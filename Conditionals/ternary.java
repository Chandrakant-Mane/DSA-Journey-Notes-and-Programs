package Conditionals;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = scan.nextInt();

        // candition ? if true : if false 

        System.out.println((n%2==0) ?  "Even" : "Odd");

        scan.close();

    }
}
