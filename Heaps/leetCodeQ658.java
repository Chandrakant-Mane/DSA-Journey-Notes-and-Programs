package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class leetCodeQ658 {
    static class Pair implements Comparable<Pair> {
        int ele;
        int dist;

        Pair(int ele, int dist) {
            this.ele = ele;
            this.dist = dist;
        }

        public int compareTo(Pair p) {
            if (this.dist == p.dist) {
                return this.ele - p.ele;
            }
            return this.dist - p.dist;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 } ;
        int k = 4 ;
        int x = 3 ;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        List<Integer> ans = new ArrayList<>() ;

        for(int i = 0 ; i < arr.length; i++){
            pq.add(new Pair(arr[i] , Math.abs(x - arr[i]))) ;
            if(pq.size() > k){
                pq.remove() ;
            }
        }
        while(pq.size() > 0){
            Pair p = pq.remove() ;
            ans.add(p.ele) ;
        }
        Collections.sort(ans) ;
        System.out.println(ans);
    }
}
