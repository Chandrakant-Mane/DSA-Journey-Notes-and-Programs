package Hashmaps;

import java.util.HashMap;

public class leetCodeQ1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15} ;
        int target = 9 ;

        int[] ans = {-1 , -1} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            int remaining = target - nums[i] ;
            if(map.containsKey(remaining)){
                int val = map.get(remaining) ;
                ans[0] = val ;
                ans[1] = i ;
                break ;
            }
            else{
                map.put(nums[i] , i) ;
            }
        }
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
