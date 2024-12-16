package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class basicHeapCF {
    public static void main(String[] args) {
        
        System.out.println("MINHEAP");

        // MinHeap 
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        pq.add(2) ;
        System.out.println(pq + " " + pq.peek());
        pq.add(10) ;
        System.out.println(pq + " " + pq.peek());
        pq.add(1) ;
        System.out.println(pq + " " + pq.peek());
        pq.remove() ;
        System.out.println(pq + " " + pq.peek());
        pq.add(0) ;
        System.out.println(pq + " " + pq.peek());

        pq.add(-34) ;
        System.out.println(pq + " " + pq.peek());

        pq.add(100) ;
        System.out.println(pq + " " + pq.peek());
        pq.add(99);
        System.out.println(pq + " " + pq.peek());

        System.out.println();

        System.out.println("MAXHEAP");

        // MaxHeap 
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.add(2);
        System.out.println(maxPQ + " " + maxPQ.peek());
        maxPQ.add(10);
        System.out.println(maxPQ + " " + maxPQ.peek());
        maxPQ.add(1);
        System.out.println(maxPQ + " " + maxPQ.peek());
        maxPQ.remove();
        System.out.println(maxPQ + " " + maxPQ.peek());
        maxPQ.add(0);
        System.out.println(maxPQ + " " + maxPQ.peek());

        maxPQ.add(-34);
        System.out.println(maxPQ + " " + maxPQ.peek());

        maxPQ.add(100);
        System.out.println(maxPQ + " " + maxPQ.peek());
        maxPQ.add(99);
        System.out.println(maxPQ + " " + maxPQ.peek());
    }
}
