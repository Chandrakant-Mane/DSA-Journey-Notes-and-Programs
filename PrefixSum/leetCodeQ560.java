package PrefixSum;

import java.util.HashMap;

public class leetCodeQ560 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 } ;
        int k = 3 ;
        int n = nums.length ;
        int count = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 1 ; i < n ; i++){
            nums[i] += nums[i-1] ;
        }
        
        for(int i = 0 ; i < n ; i++){
            int key = nums[i] ; 
            int rem = key - k ;
            if(key == k) count++ ;
            if(map.containsKey(rem)){
                int freq = map.get(rem) ;
                count += freq ;
            }
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq+1) ;
            }
            else map.put(key , 1) ;
        }

        System.out.println(count);

    }
}
