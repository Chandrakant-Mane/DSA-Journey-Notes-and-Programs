package Conditionals;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter cost price : ");
        int cp = scan.nextInt();
        System.out.print(" Enter selling price : ");
        int sp = scan.nextInt();

        if(cp<sp)
            System.out.println(" Profit is " +(sp-cp));
        if(cp>sp)
            System.out.println(" Loss is " +(cp-sp));
        if(cp==sp) 
            System.out.println(" No Profit No Loss ");


            scan.close();

    }
    
}
