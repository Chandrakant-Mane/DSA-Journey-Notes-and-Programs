package Conditionals;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        // Given the length and breadth of a rectangle,
        // write a program to find whether the area of the
        // rectangle is greater than its perimeter.
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter length of rectangle : ");
        int l = scan.nextInt() ;
        System.out.print(" Enter breadth of rectangle : ");
        int b = scan.nextInt() ;

        int area = l*b , perimeter = 2*(l+b) ;
        System.out.println(" Area is : " +area+ " And  Perimeter is : " +perimeter);

        if(area>perimeter) 
            System.out.println(" Area is Greater Than Perimeter ");
        else 
            System.out.println(" Perimeter is Greater Than Area ");

        scan.close();

    }
}
