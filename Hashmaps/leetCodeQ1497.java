package Hashmaps;

import java.util.HashMap;

public class leetCodeQ1497 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9} ;
        int k = 5 ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int ele : arr){
            int key = ele%k ;
            if(key < 0) key += k ;
            // int key = ((ele % k) + k) % k ;
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key , freq+1) ;
            }
            else 
                map.put(key, 1) ;
        }

        if(map.containsKey(0)){
            if(map.get(0) % 2 != 0) System.out.println(false); 
            map.remove(0) ;
        }
        if(k%2 == 0 && map.containsKey(k/2)){
            if(map.get(k/2) % 2 != 0) System.out.println(false);
            map.remove(k/2) ;
        }
        for(int key : map.keySet()){
            int rem = k - key ;
            if(!map.containsKey(rem)){
                System.out.println(false);
            }
            int keyFreq = map.get(key) ;
            int remFreq = map.get(rem) ;
            if(keyFreq != remFreq) System.out.println(false);
        }

        System.out.println(true);
    }
}
