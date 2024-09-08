package Strings;

import java.util.Arrays;

public class leetCodeQ1 {
    public static void main(String[] args) {
        String s = new String("anagram");
        String t = new String("naearam");
        if(s.length()!=t.length()) System.out.println("False");

        char[] arr = s.toCharArray();
        char[] brr = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean flag = false ; 
        for (int i = 0; i < s.length(); i++) {
            if(arr[i]!=brr[i]){
                flag = false ;
                break ;  
            } 
            else flag = true ;
        }
        if(flag == false) System.out.println("False");
        else System.out.println("True");
    }
    
}
