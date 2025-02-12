package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ207 {
    public static boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] indegree = new int[n] ;
        for(int i = 0 ; i < pre.length ; i++){
            int a = pre[i][0] , b = pre[i][1] ; // b -> a
            indegree[a]++ ;
            adj.get(b).add(a);
        }

        // Kahn's Algorithm 
        Queue<Integer> q = new LinkedList<>() ;
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            if(indegree[i] == 0)
                q.add(i) ;
        }
        while(q.size() > 0){
            int front = q.remove() ;
            ans.add(front) ;
            for(int ele : adj.get(front)){
                indegree[ele]-- ;
                if(indegree[ele] == 0)
                    q.add(ele) ;
            }
        }
        return (ans.size() == n) ;
    }
    public static void main(String[] args) {
        int n = 5 ;
        int[][] pre = { { 3, 2 } , { 1, 0 } , { 2, 1 } , { 4, 3 } , { 0, 3 } } ;
        System.out.println(canFinish(n, pre));

    }
}
