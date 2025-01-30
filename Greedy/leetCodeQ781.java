package Greedy;

import java.util.HashMap;

public class leetCodeQ781 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 } ;
        HashMap<Integer, Integer> map = new HashMap<>() ;
        int n = arr.length ;
        for(int i = 0 ; i < n ; i++){
            int key = arr[i]+1 ;
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq+1) ;
            }
            else map.put(key , 1) ;
        }
        int ans = 0 ;
        for(int key : map.keySet()){
            int val = map.get(key) ;
            int q = val/key ;
            int r = val%key ;
            ans += q*key ;
            if(r > 0)
                ans += key ;
        }
        System.out.println(ans);
    }
}
