package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ547 {
            //   BFS 
    public static  void bfs(int i , boolean[] vis , int[][] adj){
        int n = adj.length ;
        vis[i] = true ;
        Queue<Integer> q = new LinkedList<>() ;
        q.add(i) ;
        while(!q.isEmpty()){
            int front = q.remove() ;
            for(int j = 0 ; j < n ; j++){
                if(adj[front][j] == 1 && vis[j] == false){
                    q.add(j) ;
                    vis[j] = true ;
                }
            }
        }
    }
            //   DFS 
    public static  void dfs(int i , boolean[] vis , int[][] adj){
        int n = adj.length ;
        vis[i] = true ;
        for(int j = 0 ; j < n ; j++){
            if(adj[i][j] == 1 && vis[j] == false){
                dfs(j , vis , adj) ;
            }
        }
    }
    public static  int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n]; // false
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                // bfs(i , vis , adj) ;
                dfs(i, vis, adj);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] adj = { { 1, 1, 0 } , { 1, 1, 0 } , { 0, 0, 1 }} ;
        System.out.println(findCircleNum(adj));
    }
}
