package BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class leetCodeQ260 {
    public static int[] singleNumber(int[] nums) {
        // 1 5 7 1 8 5 9 7 2 2  -> ans = { 8 , 9 } 
            // Method 1 : HashMap 
        int[] ans = new int[2] ;
        int idx = 0 ;
        Map<Integer , Integer> map = new HashMap<>() ;
        for(int ele : nums){
            if(map.containsKey(ele))
                map.put(ele , 2) ;
            else 
                map.put(ele , 1) ;
        }
        for(int key : map.keySet()){
            int freq = map.get(key) ;
            if( freq == 1){
                ans[idx++] = key ;
            } 
        }
        return ans ;
    }
    
    public static int[] singleNumber2(int[] nums) {
        // 1 5 7 1 8 5 9 7 2 2 -> ans = { 8 , 9 }
        // Method 2 : Bit Manuplation
        int xor = 0;
        for (int ele : nums) {
            xor ^= ele;
        }
        int rightBitOff = xor & (xor - 1);
        int mask = xor ^ rightBitOff;
        int b1 = 0, b2 = 0;
        for (int ele : nums) {
            if ((mask & ele) == 0)
                b1 ^= ele;
            else
                b2 ^= ele;
        }
        int[] ans = { b1, b2 };
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1,2,1,3,2,5 } ;
        int[] ans = singleNumber(nums) ;
        for(int ele : ans){
            System.out.print(ele + " ");
        }
        System.out.println();

        ans = singleNumber2(nums) ;
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
