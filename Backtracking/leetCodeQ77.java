package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ77 {
    public static void backTrack(List<List<Integer>> result, List<Integer> comb, int start, int n, int k) {
        if (comb.size() == k) {
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            backTrack(result, comb, i + 1, n, k);
            comb.remove(comb.size() - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4 ;
        int k = 2 ;
        List<List<Integer>> result = new ArrayList<>() ;
        backTrack(result , new ArrayList<>() , 1 , n , k) ;
        System.out.println(result);
    }
}
