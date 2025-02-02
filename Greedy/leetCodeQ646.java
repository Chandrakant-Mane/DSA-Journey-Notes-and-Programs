package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class leetCodeQ646 {
    public static int findLongestChain(int[][] pairs) {
        Comparator<int[]> com = new Comparator<int[]>(){
            public int compare(int[] i , int[] j){
                return i[1]-j[1];
            }
        };
        Arrays.sort(pairs , com) ;
        int prend = Integer.MIN_VALUE ;
        int count = 0 ;
        for(int[] pair : pairs){
            if(prend < pair[0]){
                count++ ;
                prend = pair[1] ;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[][] pairs = { { 1,2 } , { 2, 3 } , { 3, 4 }} ;
        System.out.println(findLongestChain(pairs));
    }
}
