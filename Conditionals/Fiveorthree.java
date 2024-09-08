package Conditionals;

import java.util.Scanner;

public class Fiveorthree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = scan.nextInt();

        if(n%5 == 0 || n%3 == 0) 
            System.out.println(n+ " is divisible by 5 or 3 ");
        else
            System.out.println(n+ " is Not divisible by 5 or 3 ");

        scan.close();
    }
}
