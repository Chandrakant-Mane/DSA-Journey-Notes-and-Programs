package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class gfgUndirectedGraphCycle {
    static class Pair{
        int node ;
        int parent ;
        Pair(int node , int parent){
            this.node = node ;
            this.parent = parent ;
        }
    }
            // Bfs 
    public static boolean bfs(int i , ArrayList<ArrayList<Integer>> adj , boolean[] vis ){
        vis[i] = true ;
        Queue<Pair> q = new LinkedList<>() ;
        q.add(new Pair(i , -1)) ;
        while(q.size() > 0){
            Pair front = q.remove() ;
            int node = front.node ;
            int parent = front.parent ;
            for(int ele : adj.get(node)){
                if(vis[ele] == false ){
                    q.add(new Pair(ele , node)) ;
                    vis[ele] = true ;
                }
                else if(parent != ele){
                    return true ;
                }
            }
        }
        return false ;
    }
            // Dfs 
    public static boolean dfs(int i , ArrayList<ArrayList<Integer>> adj , boolean[] vis , int prev , boolean ans ){
        vis[i] = true ;
        for(int ele : adj.get(i)){
            if(vis[ele] == false ){
                ans = dfs(ele , adj , vis , i , ans) ;
            }
            else if(prev != ele){
                return true ;
            }
        }
        
        return ans ;
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n = adj.size() ;
        boolean ans = false ;
        boolean[] vis = new boolean[n] ;
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == false){
                if(bfs( i , adj , vis)) 
                    return true;

                // ans = dfs( i , adj , vis , -1 , ans) ;
            }
        }
        
        return ans ;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ;
        ArrayList<Integer> a = new ArrayList<>() ;
        a.add(1) ;
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0) ; b.add(2) ; b.add(4) ;
        ArrayList<Integer> c = new ArrayList<>() ;
        c.add(1) ; c.add(3) ;
        ArrayList<Integer> d = new ArrayList<>();
        d.add(2) ; d.add(4) ;
        ArrayList<Integer> e = new ArrayList<>(); 
        e.add(1) ; e.add(3) ;

        adj.add(a) ; adj.add(b) ; adj.add(c) ; adj.add(d) ; adj.add(e) ;

        System.out.println(isCycle(adj));



    }
}
