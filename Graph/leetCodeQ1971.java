package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ1971 {
    public static  void bfs(int i , boolean[] vis , List<List<Integer>> adj , int end){
        Queue<Integer> q = new LinkedList<>() ;
        q.add(i) ;
        while(!q.isEmpty()){
            int front = q.remove() ;
            for(int ele : adj.get(front)){
                if(vis[ele] == false){
                    q.add(ele) ;
                    vis[ele] = true ;
                    if(ele == end) 
                        return ;
                }
            }
        }
    }
    public static  void dfs(int i , boolean[] vis , List<List<Integer>> adj , int end){
        vis[i] = true ;
        for(int ele : adj.get(i)){
            if(vis[ele] == false){
                dfs(ele , vis , adj , end) ;
                if(ele == end) 
                    return ;
            }
        }
    }
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return true ;
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            List<Integer> list = new ArrayList<>() ;
            adj.add(list) ;
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b) ;
            adj.get(b).add(a) ;
        }
        boolean[] vis = new boolean[n] ; // false 
        // vis[start] = true ;
        // bfs(start , vis , adj , end) ;
        dfs(start , vis , adj , end) ;
        return (vis[end]) ;


    }
    public static void main(String[] args) {
        int n = 3 ;
        int star= 0 , end = 2 ;
        int[][] edges = { { 0, 1 } , { 1, 2 } , { 2, 0 }} ;
        System.out.println(validPath(n, edges, star, end));
    }
}
