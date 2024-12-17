package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetCodeQ973M2 {
    static class Triplet implements Comparable<Triplet> {
        int d;
        int x;
        int y;

        Triplet(int d, int x, int y) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        public int compareTo(Triplet t) {
            return this.d - t.d;
        }
    }
    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder()) ;

        int n = points.length ;
        for(int i = 0 ; i < n ; i++){
            int x = points[i][0] , y = points[i][1] ;
            int d = x*x + y*y ;
            pq.add(new Triplet(d,x,y)) ;
            if(pq.size() > k)
                pq.remove() ;
        }

        int[][] ans = new int[k][2] ;

        for(int i = 0 ; i < k ; i++ ){
            Triplet t = pq.remove() ;
            ans[i][0] = t.x ;
            ans[i][1] = t.y ;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(ans[i][0] + " " + ans[i][1]);
            System.out.println();
        }

    }
}
