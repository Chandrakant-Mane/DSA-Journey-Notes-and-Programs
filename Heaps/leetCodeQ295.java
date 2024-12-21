package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetCodeQ295 {
    static class MedianFinder {
        PriorityQueue<Integer> maxHeap  ;
        PriorityQueue<Integer> minHeap ;
        public MedianFinder() {
            minHeap = new PriorityQueue<>(); 
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }
    
        public void addNum(int num) {
            if(maxHeap.size() == 0) maxHeap.add(num) ;
            else{
                if(num < maxHeap.peek()) maxHeap.add(num) ;
                else minHeap.add(num) ;
            }
            // Balance the heap 
            if(maxHeap.size() > minHeap.size() + 1){
                minHeap.add(maxHeap.remove()) ;
            }
            if(minHeap.size() > maxHeap.size() + 1){
                maxHeap.add(minHeap.remove()) ;
            }
        
        }
    
        public double findMedian() {
            if(maxHeap.size() == minHeap.size()){
                return (maxHeap.peek() + minHeap.peek()) / 2.0 ;
            }
            else if(maxHeap.size() > minHeap.size())
               return maxHeap.peek() ;
            else
                return minHeap.peek() ;
        }
    }

    public static void main(String[] args) {
        MedianFinder med = new MedianFinder() ;
        med.addNum(-1);
        System.out.println(med.findMedian());
        med.addNum(-2);
        System.out.println(med.findMedian());
        med.addNum(-3);
        System.out.println(med.findMedian());
        med.addNum(-4);
        System.out.println(med.findMedian());
        med.addNum(-5);
        System.out.println(med.findMedian());
    }
}
