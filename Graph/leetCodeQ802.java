package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ802 {
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length ;
        // 1st Step Reverse The Graph : 
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] indgree = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            for(int ele : graph[i]){
                // In Original Graph , Edge is from i -> ele 
                // In Reverse Graph , It will be ele -> i 
                adj.get(ele).add(i) ;
                indgree[i]++ ;
            }
        }
        // Kahn's Algorithm : 
        Queue<Integer> q = new LinkedList<>()  ;
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 0  ; i < n ; i++){
            if(indgree[i] == 0)
                q.add(i) ;
        }
        while(q.size() > 0){
            int front = q.remove() ;
            ans.add(front) ;
            for(int ele : adj.get(front)){
                indgree[ele]-- ;
                if(indgree[ele] == 0)
                    q.add(ele) ;
            }
        }
        Collections.sort(ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        int[][] graph = { { 1, 2 } , { 2, 3 } , { 5 } , { 0 } , { 5 } , { } , { }} ;
        List<Integer> ans = eventualSafeNodes(graph) ;
        for(int ele : ans ){
            System.out.print(ele + " ");
        }

    }
}
