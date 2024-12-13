package Hashmaps ;

import java.util.HashMap;

public class leetCodeQ3 {
    public static void main(String[] args) {
        String s = "abcabcbb" ;
        int n = s.length() ;
        if(n <= 1) System.out.println(n);
        int maxLen = 0 ;
        int i = 0  , j = 0 ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        while(j < n){
            char ch = s.charAt(j) ;
            if(map.containsKey(ch) && map.get(ch) >= i){
                int len = j - i;
                maxLen = Math.max(maxLen , len) ;
                // i ko leke jao ch ki purani position se aage 
                while(s.charAt(i) != ch) i++ ;
                i++ ; // ek aage nikalna hai
            }
            map.put(ch , j) ;
            j++ ;
        }
        int len = j - i;
        maxLen = Math.max(maxLen , len) ;
        System.out.println(maxLen);
    }
}
