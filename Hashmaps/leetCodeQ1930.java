package Hashmaps ;

import java.util.HashMap;
import java.util.HashSet;

public class leetCodeQ1930 {
    public static void main(String[] args) {
        String s = "bbcbaba" ;
        HashMap<Character , Integer> firstMap = new HashMap<>() ;
        HashMap<Character , Integer> lastMap = new HashMap<>() ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            if(!firstMap.containsKey(ch)){
                firstMap.put(ch , i) ;
            }
            lastMap.put(ch , i) ;
        }
        int count = 0 ;
        for(char ch : firstMap.keySet()){
            int firstIdx = firstMap.get(ch) ;
            int lastIdx = lastMap.get(ch) ;
            HashSet<Character> set = new HashSet<>() ;
            for(int i = firstIdx + 1 ; i < lastIdx ; i++ ){
                set.add(s.charAt(i)) ;
            }
            count += set.size() ;
        }

        System.out.println(count );
    }
}
