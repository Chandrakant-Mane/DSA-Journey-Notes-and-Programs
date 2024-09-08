package Conditionals;

import java.util.Scanner;

public class hw5 {

    // If the ages of Ram, Shyam and Ajay are input
    // through the keyboard, write a program to determine
    // the youngest of the three.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the age of RAM : ");
        int ram = scan.nextInt();
        System.out.print(" Enter the age of SHYAM : ");
        int shyam = scan.nextInt();
        System.out.print(" Enter the age of AJAY : ");
        int ajay = scan.nextInt();

        if (ram <= shyam) {
            if (ram <= ajay)
                System.out.println(" Ram is Youngest ");
            else
                System.out.println(" Ajay is Youngest ");
        } else {
            if (shyam <= ajay)
                System.out.println(" Shyam is Youngest ");
            else
                System.out.println(" Ajay is Youngest ");
        }

        scan.close();
    }

}
