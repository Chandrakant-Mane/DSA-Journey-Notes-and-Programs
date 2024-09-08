package Strings;

import java.util.Scanner;

public class setCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1, 'H');
        System.out.println(sb);
        sc.close();

    }
}
