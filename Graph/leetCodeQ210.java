package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ210 {
    public static int[] findOrder(int n, int[][] pre) {
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
        int[] ans2 = new int[ans.size()] ;
        for(int i = 0 ; i < ans.size() ; i++){
            ans2[i] = ans.get(i) ;
        }
        if(ans.size() != n)
            return new int[0];
        return ans2 ;
    }
    public static void main(String[] args) {
        int n = 4 ;
        int[][] pre = { { 1, 0 } , { 2, 0 } , { 3, 1 } , { 3, 2 } } ;
        int[] ans = findOrder(n, pre) ;
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
