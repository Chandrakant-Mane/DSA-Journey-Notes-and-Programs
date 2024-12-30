package SlidingWindows ;

import java.util.HashMap;

public class leetCodeQ904 {
    public static void main(String[] args) {
        int[] fruits = { 1, 2, 3, 2, 2 } ;
        int n = fruits.length , i = 0 , j = 0 , maxLen = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        while(j < n){
            if(map.containsKey(fruits[j])){
                int freq = map.get(fruits[j]) ;
                map.put(fruits[j] , freq + 1) ;
            }
            else map.put(fruits[j] , 1) ;

            while(map.size() > 2){
                int freq = map.get(fruits[i]) ;
                if(freq == 1) map.remove(fruits[i]) ;
                else map.put(fruits[i] , freq-1) ;
                i++ ;
            }

            int len = j-i+1 ;
            maxLen = Math.max(maxLen , len) ;
            j++ ;
        }

        System.out.println(maxLen);

    }
}
