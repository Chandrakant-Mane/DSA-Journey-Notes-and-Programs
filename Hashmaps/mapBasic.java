package Hashmaps ;

import java.util.HashMap;

public class mapBasic {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>() ;
        


        map.put("Raghav", 76) ;
        map.put("Himanshu", 83) ;
        map.put("Amritanshu", 13) ;
        map.put("Ayushi", 82) ;
        map.put("Prachi", 88) ;
        System.out.println(map);

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }

        // System.out.println(map.containsKey("Raghav"));
        // System.out.println(map.containsKey("Ghagan"));

        // System.out.println(map.containsValue(87));
        // System.out.println(map.containsValue(83)) ;

        // map.put("Raghav", 100) ;
        // System.out.println(map);

        // map.put("Harish", 100) ;
        // System.out.println(map);

        // System.out.println(map.containsValue(100));

        // System.out.println("map size is : " + map.size());

        // map.remove("Raghav") ;
        // System.out.println(map + "map size is : " + map.size());

        // map.remove("Manahor") ; // No Error 

        // // map.remove(100) ; 
        // map.remove(76) ;
        // System.out.println(map);


        // System.out.println(map.get("Himanshu"));
    }
}
