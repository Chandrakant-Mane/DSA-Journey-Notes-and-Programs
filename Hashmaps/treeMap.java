package Hashmaps;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>() ;
        map.put("raghav", 76 ) ;
        map.put("Himanshu", 83 ) ;
        map.put("amritanshu", 13 ) ;
        map.put("Sunil" , 2) ;
        map.put("Ayushi", 82 ) ;
        map.put("prachi", 88 ) ;

        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
