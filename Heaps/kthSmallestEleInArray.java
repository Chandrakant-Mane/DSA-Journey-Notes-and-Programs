package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestEleInArray {
    public static void main(String[] args) {
        int[] arr = { 10 , 2 , 3 , 8 , -4 , -2 , 6} ;
        int k = 3 ;

        // Useless method TC : O(n + k long n ) 
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(int i = 0 ; i < arr.length ; i++){
            pq.add(arr[i]) ;
        }
        for(int i = 1 ; i < k ;i++){
            pq.remove() ;
        }

        System.out.println(pq.remove());

        // Best Method : TC : O(n log k)

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()) ;

        for(int i = 0 ; i < arr.length ; i++){
            maxPQ.add(arr[i]) ;
            if(maxPQ.size() > k){
                maxPQ.remove() ;
            }
        }

        System.out.println(maxPQ.peek());
    }

}
