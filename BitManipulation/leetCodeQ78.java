package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        int n = nums.length ;
        int total = (1 << n) ;
        for(int num = 0 ; num < total ; num++){
            List<Integer> list = new ArrayList<>() ;
            for(int bitIdx = 0 ; bitIdx < n ; bitIdx++){
                int mask = (1 << bitIdx) ;
                if((num & mask )!= 0){
                    list.add(nums[bitIdx]) ;
                }
            }
            ans.add(list) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums = { 1,2,3 } ;

        System.out.println(subsets(nums));

    }
}
