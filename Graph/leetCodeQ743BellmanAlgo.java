package Graph;

import java.util.Arrays;

public class leetCodeQ743BellmanAlgo {
    public static int networkDelayTime(int[][] times, int n, int src) {
        int[] dist = new int[n+1];
        Arrays.fill(dist , Integer.MAX_VALUE) ;
        dist[src] = 0 ;
        for(int x = 1 ; x <= n-1 ; x++){// n-1 times edges travel 
            for(int i = 0 ; i < times.length ; i++){  // All Edges Relax 
                int u = times[i][0] ;
                int v = times[i][1] ;
                int wt = times[i][2] ;
                if(dist[u] !=  Integer.MAX_VALUE && dist[u] + wt < dist[v])
                    dist[v] = dist[u] + wt ;
            }
        }
        // nth time relaxation for -ve detection
        for(int i = 0 ; i < times.length ; i++){  // All Edges Relax 
                int u = times[i][0] ;
                int v = times[i][1] ;
                int wt = times[i][2] ;
                if(dist[u] !=  Integer.MAX_VALUE && dist[u] + wt < dist[v])
                    return -1 ; // Indicating A Negative Cycle .
            }
        int max = 0 ; 
        for(int i = 1 ; i < dist.length ; i++){
            if(dist[i] == Integer.MAX_VALUE)
                return -1 ;
            max = Math.max(max , dist[i]) ;
        }
        return max ;
    }
    public static void main(String[] args) {
        int[][] times = { { 2, 1, 1 } , { 2, 3, 1 } , { 3, 4, 1 } } ;
        int n = 4 , k = 2 ;
        System.out.println(networkDelayTime(times, n, k));
    }
}
