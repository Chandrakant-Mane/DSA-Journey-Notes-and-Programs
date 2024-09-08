package Conditionals;

import java.util.Scanner;

public class hw6 {


// Given a point (x, y), write a program to find out 
// if it lies in the 1st Quadrant, 2nd Quadrant, 3rd 
// Quadrant, 4th Quadrant, on the x-axis, y-axis or at 
// the origin, viz. (0, 0).

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print(" Enter a 1st Number : ");
    int x = scan.nextInt();
    System.out.print(" Enter a 2nd Number : ");
    int y = scan.nextInt();

    if (x==0 && y==0)
        System.out.println(" It lies on Origin ");
    else if (x==0)
        System.out.println(" It lies on y-axis ");
    else if (y==0)
        System.out.println(" It lies on x-axis ");
    else if (x>0 && y>0)
        System.out.println(" It lies on I - Quadrant ");
    else if (x<0 && y>0)
        System.out.println(" It lies on II - Quadrant ");
    else if (x<0 && y<0)
        System.out.println(" It lies on III - Quadrant ");
    else
        System.out.println(" It lies on IV - Quadrant ");

    
    scan.close();

    
    
}
    

}
