package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class leetCode1636 {
    static class Pair implements Comparable<Pair> {
        int key;
        int freq;

        Pair(int key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        // Custom Comparable so that Heap can compare on the bases of frequencys .
        // if freq is same then greater key will be first .
        public int compareTo(Pair p) {
            if (this.freq == p.freq)
                return p.key - this.key;
            return this.freq - p.freq;
        }
    }
    public static void main(String[] args) {
        int[] nums = { -1, 1, -6, 4, 5, -6, 1, 4, 1 } ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        // Using Map Calculate Frequency of all ele.
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele) ;
                map.put(ele , freq+1) ;
            }
            else map.put(ele , 1) ;
        }

        // Store ele And there freq in MinHeap so that we can arrange them in increasing order
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        for(int key : map.keySet()){
            pq.add(new Pair(key , map.get(key))) ;
        }

        int idx = 0 ;
        // Now add them in Array . You need to add ele for freq times means ele(1) has freq(3) it means ele(1) need to added 3 times ;
        // If the two ele has same freq then ele which is geater need to added first .
        // No need of worry it will be checked by Heaps Custome Comparable .
        while(pq.size() > 0 ){
            Pair p = pq.remove();
            int fq = p.freq ;
            // int ele = p.key ;
            for(int j = 0 ; j < fq ; j++ ){
                nums[idx] = p.key ;
                idx++ ;
            }
        }

        for(int ele : nums ){
            System.out.print(ele + " ");
        }
    }
}
