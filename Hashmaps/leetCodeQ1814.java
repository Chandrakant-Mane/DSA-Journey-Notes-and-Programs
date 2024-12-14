package Hashmaps;

import java.util.HashMap;

public class leetCodeQ1814 {
    public static int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] nums = { 13, 10, 35, 24, 76} ;

        int count = 0 ;
        int n = nums.length ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++){
            int key = nums[i] - rev(nums[i]) ;
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq + 1) ;
                count += freq ;
                count %= 1000000007 ;
            }
            else map.put(key , 1) ;
        }

        System.out.println(count); 
    }
}
