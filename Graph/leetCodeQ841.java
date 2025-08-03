package Graph ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ841 {
    public static void bfs(int start , boolean[] vis , List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>() ;
        q.add(start) ;
        while(q.size()>0){
            int front = q.remove() ;
            for(int ele : adj.get(front)){
                if(!vis[ele]){
                    q.add(ele) ;
                    vis[ele] = true ;
                }
            }
        }
    }

    public static void dfs(int start , boolean[] vis , List<List<Integer>> adj){
        vis[start] = true ;
        for(int ele : adj.get(start)){
            if(!vis[ele]){
                dfs(ele , vis , adj) ;
            }
        }
    }

    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size() ;
        boolean[] vis = new boolean[n] ;
        // vis[0] = true ;
        bfs(0 , vis , adj) ;
        // dfs(0 , vis , adj) ;
        for(boolean ele : vis){
            if(ele == false)
                return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>() ;

        List<Integer> a = new ArrayList<>() ;
        a.add(1) ;  a.add(3) ;
        List<Integer> b = new ArrayList<>() ;
        b.add(3) ;  b.add(0) ;  b.add(1) ;
        List<Integer> c = new ArrayList<>() ;
        c.add(2) ;
        List<Integer> d = new ArrayList<>() ;
        d.add(0) ;

        adj.add(a) ; adj.add(b) ; adj.add(c) ; adj.add(d) ;

        System.out.println(canVisitAllRooms(adj));
    }
}
