package Strings;

import java.util.Scanner;

public class toggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch ;
            if(ascii >= 65 && ascii <= 90)  { // Capital
                ascii += 32 ;
                
            }
            else if(ascii >= 97 && ascii <= 122)  { // Small
                ascii -= 32 ;
            }
            ch = (char)ascii;
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
        sc.close();
    }
}
