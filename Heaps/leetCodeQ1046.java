package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetCodeQ1046 {
    public static void main(String[] args) {
        int[] stones = { 2, 7, 4, 1, 8, 1} ;

                    // Best Approch .
        // MAXHEAP .
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        // First add all the ele of Arrays to Heap so it will be in Desc order
        for(int ele : stones){
            pq.add(ele) ;
        }
        // run a loop untill heap size become equal to 1 .
        // then every time remove two greater ele . if they are equal then will destroy themselve . 
        // if they are not equal then add there diff(y - x) in Heap . 
        while(pq.size()>1){
            int y = pq.remove() ;
            int x = pq.remove() ;
            if(y != x ){
                pq.add(y-x) ;
            }
        }
        // if heap size is 0 is means all the stones destroyed return 0 else return heap peek ele .
        if(pq.size() == 0) System.out.println(0); 
        else System.out.println(pq.peek());
    }
}
