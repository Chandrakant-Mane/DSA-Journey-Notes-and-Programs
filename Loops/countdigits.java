package Loops;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number :");
        int n = sc.nextInt();
        
        int count = 0 ;
        while(n!=0){
            n /= 10 ;
            count++;
        sc.close();
        }
        System.out.println(count);
    }
}
