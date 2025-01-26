package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ46 {
    public static void backTrack(List<List<Integer>> result , ArrayList<Integer> perm , int[] nums){
        if(perm.size() == nums.length){
            result.add(new ArrayList<>(perm)) ;
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(perm.contains(nums[i]))
                continue ;
            perm.add(nums[i]) ;
            backTrack(result , perm , nums) ;
            perm.remove(perm.size()-1) ;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 3 } ;
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums);
        System.out.println(result);
    }
}
