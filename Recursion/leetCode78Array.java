package Recursion;

import java.util.ArrayList;
import java.util.List;

public class leetCode78Array {
    static List<List<Integer>> arr;

    public static void helper(int i, int[] nums, ArrayList<Integer> ans) {
        if (i == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < ans.size(); j++) {
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i + 1, nums, ans); // Not Take
        ans.add(nums[i]);
        helper(i + 1, nums, ans); // Take
        ans.remove(ans.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        System.out.println(arr);
    }
}
