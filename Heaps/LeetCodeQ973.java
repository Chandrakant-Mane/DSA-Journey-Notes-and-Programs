package Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCodeQ973 {
    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        int[][] points = { {3, 3} , { 5, -1} , { -2, 4}} ;
        int k = 2 ;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        HashMap<Integer , Pair> map = new HashMap<>() ;

        int n = points.length ;
        for(int i = 0 ; i < n ; i++){
            int x = points[i][0] , y = points[i][1] ;
            int d2 = x*x + y*y ;
            pq.add(d2) ;
            map.put(d2 , new Pair(x , y)) ;
            if(pq.size() > k)
                pq.remove() ;
        }

        int[][] ans = new int[k][2] ;

        for(int i = 0 ; i < k ; i++ ){
            int dist = pq.remove() ;
            Pair pt = map.get(dist) ;
            ans[i][0] = pt.x ;
            ans[i][1] = pt.y ;
        }

        for(int i = 0 ; i < k ; i++){
            System.out.print(ans[i][0] + " " + ans[i][1]);
            System.out.println();
        }
    }
}
