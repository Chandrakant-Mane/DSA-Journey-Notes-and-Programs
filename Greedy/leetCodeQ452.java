package Greedy ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetCodeQ452 {
    public static int findMinArrowShots(int[][] points) {
        Comparator<int[]> com = new Comparator<int[]>(){
            public int compare(int[] i , int[] j){
                return Integer.compare(i[0] , j[0]);
            }
        };

        Arrays.sort(points , com) ;
        List<int[]> ans = new ArrayList<>() ;
        for(int[] point : points){
            if(ans.size() == 0 || ans.get(ans.size()-1)[1] < point[0]){
                ans.add(point) ;
            }
            else{
                int start = Math.max(ans.get(ans.size()-1)[0] , point[0]) ;
                int end = Math.min(ans.get(ans.size()-1)[1] , point[1]) ;
                int[] intervals = {start , end} ;
                ans.set(ans.size()-1 , intervals) ;
            }
        }
        return ans.size() ;
    }
    public static void main(String[] args) {
        int[][] points = { { 10, 16 } , { 2, 8 } , { 1, 6 } , { 7, 12 }} ;

        System.out.println(findMinArrowShots(points));
    }
}
