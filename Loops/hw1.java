package Loops;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = sc.nextInt();
        for(int i = n; i<=(n*10); i+=n){
            if (i%n == 0) 
                System.out.println(i);
            sc.close();

        }
    }
    
}
