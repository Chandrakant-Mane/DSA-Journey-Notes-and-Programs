package Strings;

import java.util.ArrayList;

public class leetCodeQ151 {
    public static void main(String[] args) {
        String s = "the sky is blue" ;
        int i = 0 ;
        int j = 0 ;
        String result = "" ;
        ArrayList<String> arr = new ArrayList<>() ;
        while( i < s.length() && j < s.length() ){
            while( i < s.length() && s.charAt(i) == ' ') i++ ;
            j = i + 1 ;
            while( j < s.length() && s.charAt(j) != ' ') j++ ;
            if(i >= s.length() && j >= s.length()) break ;
            arr.add(s.substring(i , j)) ; 
            i = j+1 ;
        }
        i = arr.size() - 1 ;
        while( i >= 0){
            if(result.length() == 0) result += arr.get(i) ;
            else result += " " + arr.get(i) ;
            i-- ;
        }

        System.out.println(result);
    }
}
