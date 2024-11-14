package Recursion;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ39 {
    public static void recursive(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (arr[ind] <= target) {
            list.add(arr[ind]);
            recursive(ind, arr, target - arr[ind], ans, list);
            list.remove(list.size() - 1);
        }
        recursive(ind + 1, arr, target, ans, list);
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7} ;
        int target = 7 ;
        List<List<Integer>> ans = new ArrayList<>() ;

        recursive(0, candidates, target, ans, new ArrayList<>());

        System.out.println(ans);

    }
}
