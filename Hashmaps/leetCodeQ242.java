package Hashmaps;

import java.util.HashMap;

public class leetCodeQ242 {
    public static void main(String[] args) {
        String s = "anagram" , t = "nagaram" ;
        if(s.length() != t.length()) System.out.println(false); ;
        HashMap<Character , Integer> map1 = new HashMap<>()  ;
        HashMap<Character , Integer> map2 = new HashMap<>()  ;

        for(int i = 0 ; i < s.length() ; i++){
            char key1 = s.charAt(i) ;
            if(map1.containsKey(key1)){
                int freq = map1.get(key1) ;
                map1.put(key1 , freq+1 ) ;
            }
            else 
                map1.put(key1 , 1) ; 
        }
        for(int i = 0 ; i < t.length() ; i++){
            char key2 = t.charAt(i) ;
            if(map2.containsKey(key2)){
                int val = map2.get(key2) ;
                map2.put(key2 , val+1 ) ;
            }
            else 
                map2.put(key2 , 1) ; 
        }
        
        for (char key : map1.keySet()) {
            if(!map2.containsKey(key)) System.out.println(false); ;
            int val1 = map1.get(key) ;
            int val2 = map2.get(key) ;
            if(val1 != val2)
                System.out.println(false); ;
            
        }

        System.out.println(true); ;
    }
}
