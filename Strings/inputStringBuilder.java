package Strings;

import java.util.Scanner;

public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        StringBuilder tb = new StringBuilder(sc.nextLine());
        System.out.println(tb);
        sc.close();
    
    }
}
