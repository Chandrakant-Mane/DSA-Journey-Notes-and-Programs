package Graph ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class leetCodeQ743 {
    static class Pair implements Comparable<Pair>{
        int node ;
        int time ; 
        Pair(int node , int time){
            this.node = node ;
            this.time = time ;
        }

        public int compareTo(Pair p){
            if(this.time == p.time)
                return this.node - p.node ;
            return this.time - p.time ;
        }

    }
    public static int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>() ;
        for(int i = 0 ; i <= n ; i++ ){
            adj.add(new ArrayList<>()) ;
        }
        // for(int i = 0 ; i < times.length ; i++){
        //     int u = times[i][0] , v = times[i][1] , time = times[i][2] ;
        //     adj.get(u).add(new Pair(v , time)) ;
        // }
        for(int[] arr : times){
            adj.get(arr[0]).add(new Pair(arr[1] , arr[2])) ;
        }

        int[] ans = new int[n+1] ;
        Arrays.fill(ans , Integer.MAX_VALUE) ;
        ans[k] = 0 ;
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        pq.add(new Pair(k , 0)) ;
        while(pq.size() > 0){
            Pair top = pq.remove() ;
            int node = top.node , time = top.time ;
            if(time > ans[node])
                continue ;
            for(Pair p : adj.get(node)){
                int totalTime = p.time + time ;
                if(totalTime < ans[p.node]){
                    ans[p.node] = totalTime ;
                    pq.add(new Pair(p.node , totalTime)) ;
                }
            }
        }
        int max = -1 ;
        for(int i = 1 ; i <= n ; i++){
            if(ans[i] == Integer.MAX_VALUE)
                return -1 ;
            max = Math.max(max , ans[i]) ;
        }
        return max ;
    }
    public static void main(String[] args) {
        int[][] times = { { 2, 1, 1 } , { 2, 3, 1 } , { 3, 4, 1 } } ;
        int n = 4  , k = 2 ; 

        System.out.println(networkDelayTime(times, n, k));

    }
}
