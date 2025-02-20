package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class leetCodeQ1584DSU {
    public static class Edge implements Comparable<Edge>{
        int u ; 
        int v ; 
        int dist ;
        Edge(int u , int v , int dist){
            this.u = u ;
            this.v = v ;
            this.dist = dist ;
        }
        public int compareTo(Edge t){
            if(this.dist == t.dist)
                return Integer.compare(this.u , t.u) ;
            return Integer.compare(this.dist , t.dist) ;
        }
    }
    public static int leader(int a){
        if(parent[a] == a)
            return a ;
        return parent[a] = leader(parent[a]);
    }
    public static void union(int a , int b){
        a = leader(a) ;
        b = leader(b) ;
        if(a != b){
            if(size[a] > size[b]){
                parent[b] = a ;
                size[a] += size[b] ;
            }
            else{
                parent[a] = b ;
                size[b] += size[a] ;
            }
        }
    }
    static int[] parent , size ;
    public static int minCostConnectPoints(int[][] point) {
        int n = point.length ; // 0 to n-1 
        parent = new int[n] ;
        size = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            parent[i] = i ;
            size[i] = 1 ;
        }

        ArrayList<Edge> list = new ArrayList<>() ;
        for(int u = 0 ; u < n ; u++){
            for(int v = u+1 ; v < n ; v++){
                // u t0 v edge
                int x1 = point[u][0] , y1 = point[u][1] ;
                int x2 = point[v][0] , y2 = point[v][1] ;
                int dist = Math.abs(x1-x2) + Math.abs(y1-y2) ;
                list.add(new Edge(u , v , dist)) ;
            }
        }
        Collections.sort(list) ;
        int cost = 0 ;
        for(int i = 0 ; i < list.size() ; i++){
            Edge top = list.get(i) ;
            int u = top.u , v = top.v , dist = top.dist ;
            if(leader(u) != leader(v)){
                cost += dist ;
                union(u , v) ;
            }
        }
        return cost ;

    }
    public static void main(String[] args) {
        int[][] points = { { 0, 0 } , { 2, 2 } , { 3, 10 } , { 5, 2 } , { 7, 0 }} ;
        System.out.println(minCostConnectPoints(points));
    }
}
