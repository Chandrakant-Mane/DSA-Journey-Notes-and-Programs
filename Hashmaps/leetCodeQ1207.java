package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class leetCodeQ1207 {
    public static void main(String[] args) {
        int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < arr.length ; i++){
            int key = arr[i] ;
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq+1 ) ;
            }
            else map.put(arr[i] , 1) ;
        }
        HashSet<Integer> set = new HashSet<>() ;
        for(int val : map.values()){
            if(set.contains(val)) System.out.println(false); 
            else set.add(val) ;
        }
        System.out.println(true);
    }
}
