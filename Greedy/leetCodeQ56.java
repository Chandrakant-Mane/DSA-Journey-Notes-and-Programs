package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetCodeQ56 {
    public static int[][] convertListToArray(List<List<Integer>> list) {
        int rows = list.size();
        int cols = list.get(0).size();
        int[][] array = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        
        return array;
    }

    public static int[][] merge(int[][] arr) {
        int n = arr.length ;
        Comparator<int[]> com = new Comparator<int[]>(){
            public int compare(int[] i , int[] j){
                return i[0] - j[0] ;
            }
        };
        Arrays.sort(arr , com) ;
        List<List<Integer>> ans = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            List<Integer> end = new ArrayList<>() ;
            if(i > 0){
                end = ans.get(ans.size()-1) ;
            }
            if(ans.size() == 0 || arr[i][0] > end.get(1)){
                ans.add(Arrays.asList(arr[i][0] , arr[i][1])) ;
            }
            else{
                end.set(1 , Math.max(end.get(1) , arr[i][1])) ;
            }
        }
        return convertListToArray(ans) ;
    }
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 } , { 2, 6 } , { 8, 10 } , { 15, 18 }} ;

        intervals = merge(intervals) ;

        for(int i = 0 ; i < intervals.length ; i++){
            System.out.print(intervals[i][0] + " ");
            System.out.println(intervals[i][1]);
        }
        System.out.println();
    }
    
}
