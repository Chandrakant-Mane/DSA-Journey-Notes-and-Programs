package Strings;

import java.util.Scanner;

public class converIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        // String s = ""+ n;
        String s = Integer.toString(n); 
        System.out.println(s);
        sc.close();
        System.out.println(s.length());



    }
    
}
