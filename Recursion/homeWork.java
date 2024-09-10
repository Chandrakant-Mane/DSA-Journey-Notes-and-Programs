package Recursion;

import java.util.ArrayList;

public class homeWork {
    static ArrayList<String> arr = new ArrayList<>() ;  // Global 
    public static void printSubsets(int i , String s , int k , String ans) {
        if(i==s.length() || ans.length() == k){
            // System.out.println(ans);
            arr.add(ans);
            return ;
        }
        // char ch = s.charAt(i) ;
        printSubsets(i+1, s , k , ans);   // Not Take
        ans += s.charAt(i) ;
        printSubsets(i+1, s , k , ans); // Take
    }
    public static void main(String[] args) {
        String s = "123456" ;
        arr = new ArrayList<>();  // reset 
        int k = 4 ;
        printSubsets(0,s,k,"");
        System.out.println(arr);
    }
    
}
