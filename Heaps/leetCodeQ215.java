package Heaps;

import java.util.PriorityQueue;

public class leetCodeQ215 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6} ;
        int k = 4 ;

        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            pq.add(nums[i]) ;
            if(pq.size() > k){
                pq.remove() ;
            }
        }
        System.out.println(pq.peek());
    }
}
