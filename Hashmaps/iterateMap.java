package Hashmaps;

import java.util.HashMap;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>() ;
        map.put("Raghav", 76) ;
        map.put("Himanshu", 83) ;
        map.put("Amritanshu", 13) ;
        map.put("Ayushi", 82) ;
        map.put("Prachi", 76) ;

        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println();

        for (String key : map.keySet()) {
            int val = map.get(key) ;   // Good Habit 
            System.out.println(key + " " + val);
        }

        System.out.println();

        for(Integer val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }


    }
}
