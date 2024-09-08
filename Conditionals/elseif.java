package Conditionals;

import java.util.Scanner;

public class elseif {
    
    // Take input percentage of a student and 
    // print the Grade according to marks:
    //  1) 81-100 Very Good
    //  2) 61-80 Good
    //  3) 41-60 Average
    //  4) <=40 Fail
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter percentage of student : ");
        double s1 = scan.nextDouble();

        if (s1 >= 81)
            System.out.println(" VERY GOOD ");
        else if (s1 >= 61)
            System.out.println(" GOOD ");
        else if (s1 >= 41)
            System.out.println(" Average ");
        else 
            System.out.println(" FAIL ");


        scan.close();
    }
}
