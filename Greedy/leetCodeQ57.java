package Greedy ;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ57 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 } , { 3, 5 } , { 6, 7 } , { 8, 10 } , { 12 , 16 }} ;
        int[] newInterval = { 4 , 8 } ;

        int n = arr.length ;
        List<int[]> res = new ArrayList<>() ;
        int i = 0 ;
        while(i < n && arr[i][1] < newInterval[0]){
            res.add(arr[i]) ;
            i++ ;
        }
        while(i < n && arr[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0] , arr[i][0]) ;
            newInterval[1] = Math.max(newInterval[1] , arr[i][1]) ;
            i++ ;
        }
        res.add(newInterval) ;
        while(i < n){
            res.add(arr[i]) ;
            i++ ;
        }
        // return res.toArray(new int[res.size()][]) ;

        for(int[] ele : res){
            for(int print : ele){
                System.out.print(print + " ");
            }
            System.out.println();
        }
    }
}
