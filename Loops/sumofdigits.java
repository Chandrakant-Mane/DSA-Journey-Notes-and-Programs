package Loops;

import java.util.Scanner;

public class sumofdigits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number :");
        int n = sc.nextInt();
        
        int sum = 0 ;
        while(n!=0){
            // int ld = n%10;
            sum += n%10;
            n /= 10 ;
            sc.close();
        }
        System.out.println(sum);
    }
}
