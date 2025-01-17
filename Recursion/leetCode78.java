package Recursion;

import java.util.ArrayList;

public class leetCode78 {
    static ArrayList<String> arr = new ArrayList<>() ;  // Global 
    public static void printSubsets(int i , String s , String ans) {
        if(i==s.length()){
            // System.out.println(ans);
            arr.add(ans);
            return ;
        }
        // char ch = s.charAt(i) ;
        printSubsets(i+1, s, ans);   // Not Take
        ans += s.charAt(i) ;
        printSubsets(i+1, s, ans); // Take
    }
    public static void main(String[] args) {
        String s = "abcd" ;
        arr = new ArrayList<>();  // reset 
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
