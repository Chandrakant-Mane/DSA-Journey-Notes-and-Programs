package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetCodeQ435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Comparator<int[]> com = new Comparator<int[]>(){
            public int compare(int[] i , int[] j){
                return i[0]-j[0];
            }
        };

        Arrays.sort(intervals , com) ;
        List<int[]> ans = new ArrayList<>() ;
        for(int[] point : intervals){
            if(ans.size() == 0 || ans.get(ans.size()-1)[1] <= point[0]){
                ans.add(point) ;
            }
            else{
                int start = Math.max(ans.get(ans.size()-1)[0] , point[0]) ;
                int end = Math.min(ans.get(ans.size()-1)[1] , point[1]) ;
                int[] interval = {start , end} ;
                ans.set(ans.size()-1 , interval) ;
            }
        }
        return intervals.length-ans.size() ;
    }
      
    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 } , { 2, 3 } , { 3, 4 } , { 1, 3 }} ;
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
