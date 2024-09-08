package Strings;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello" ;
        System.out.print("Enter Your Name : ");
        String str = sc.nextLine();
        System.out.print("Hi ");
        System.out.println(str);
        sc.close();
        System.out.println(s);
    }
}
