package Hashmaps;

import java.util.HashSet;

public class leetCodeQ2442 {
    public static int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 13, 10, 12, 31 } ;

        HashSet<Integer> set = new HashSet<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]) ;
            set.add(reverse(nums[i])) ;
        }

        System.out.println(set.size());
    }
}
