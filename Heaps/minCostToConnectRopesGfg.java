package Heaps;

import java.util.PriorityQueue;

public class minCostToConnectRopesGfg {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9} ;

        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        for(int ele : arr){
            pq.add(ele) ;
        }
        int minCost = 0 ;
        
        while(pq.size() > 1){
            int y = pq.remove() ;
            int x = pq.remove() ;
            int cost = x + y ;
            minCost += cost ;
            pq.add(cost) ;
        }

        System.out.println(minCost);
    }
}
