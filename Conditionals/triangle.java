package Conditionals;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter 1st Side : ");
        int a = scan.nextInt();
        System.out.print(" Enter 2st Side : ");
        int b = scan.nextInt();
        System.out.print(" Enter 3st Side : ");
        int c = scan.nextInt();

        if ((a+b)>c && (b+c)>a && (a+c)>b)
            System.out.println(" Valid Triangle ");
        else 
            System.out.println(" Invalid Triangle ");



        scan.close();

    }
}
