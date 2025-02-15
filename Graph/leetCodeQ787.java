package Graph ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ787 {
    static class Triplet{
        int node ;
        int cost ; 
        int stops ; 
        Triplet(int node , int cost){
            this.node = node ;
            this.cost = cost ;
        }
        Triplet(int node , int cost , int stops){
            this.node = node ;
            this.cost = cost ;
            this.stops = stops ;
        }
    }
    // class Triplet extends Pair {
    //     int stops ; 
    //     Triplet(int node , int cost , int stops){
    //         super(node , cost) ;
    //         this.stops = stops ;
    //     }
    //     // public int compareTo(Triplet t){
    //     //     if(this.stops == t.stops)
    //     //         return Integer.compare(this.cost , t.cost) ;
    //     //     return Integer.compare(this.stops , t.stops) ;
    //     // }

    // }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Triplet>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int[] ele : flights){
            int from = ele[0] , to = ele[1] ;
            int cost = ele[2] ;
            adj.get(from).add(new Triplet( to , cost)) ;
        }
        int[] ans = new int[n] ;
        Arrays.fill(ans , Integer.MAX_VALUE) ;
        ans[src] = 0 ;

        Queue<Triplet> pq = new LinkedList<>() ;
        pq.add(new Triplet(src , 0 , 0)) ;
        while(pq.size() > 0){
            Triplet top = pq.remove() ;
            int node = top.node , cost = top.cost , stops = top.stops ;
            if(stops == k+1)
                continue ;
            for(Triplet p : adj.get(node)){
                int totalCost = cost + p.cost ;
                if(totalCost < ans[p.node]){
                    ans[p.node] = totalCost ;
                    pq.add(new Triplet(p.node , totalCost , stops+1)) ;
                }
            }
        }
        if(ans[dst] == Integer.MAX_VALUE)
            return -1 ;
        return ans[dst] ;
    }
    public static void main(String[] args) {
        int n = 4 ; 
        int[][] flights = { { 0, 1, 100 } , { 1, 2, 100 } , { 2, 0, 100 } , { 1, 3, 600 } , { 2, 3, 200 } } ;

        int src = 0 , dst = 3 , k = 1 ;

        System.out.println(findCheapestPrice(n, flights, src, dst, k));
    }
}
