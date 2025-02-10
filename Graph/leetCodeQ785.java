package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ785 {
    public static boolean bfs(int i , int[][] adj , int[] vis , boolean ans){
        vis[i] = 0 ; // 1 -> red  , 0 -> blue 
        Queue<Integer> q = new LinkedList<>() ;
        q.add(i) ;
        while(q.size() > 0){
            int front = q.remove() ;
            int color = vis[front] ;
            for(int ele : adj[front]){
                if(vis[ele] == vis[front]){
                    ans = false ;
                    return ans ;
                }
                if(vis[ele] == -1){
                    vis[ele] = 1-color ;
                    q.add(ele) ;
                }
            }
        }
        return ans ;
    }
    public static boolean dfs(int i , int[][] adj , int[] vis , boolean ans ){
        if(vis[i] == -1)
            vis[i] = 0 ; // 1 -> red  , 0 -> blue 
        for(int ele : adj[i]){
            if(vis[ele] == vis[i]){
                ans = false ;
                return ans ;
            }
            if(vis[ele] == -1){
                vis[ele] = 1-vis[i] ;
                ans = dfs(ele ,adj , vis , ans ) ;
            }
        }
        return ans ;
    }
    public static boolean isBipartite(int[][] adj) {
        int n = adj.length ;
        boolean ans = true ;
        int[] vis = new int[n] ;
        Arrays.fill(vis , -1) ;
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == -1){
                // ans = bfs( i , adj , vis , ans) ;
                ans = dfs( i , adj , vis , ans ) ;
                if(ans == false ) 
                    return ans ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[][] adj = { { 1, 2, 3 } , { 0, 2 } , { 0, 1, 3 } , { 0, 2 } } ;

        System.out.println(isBipartite(adj));

    }
}
