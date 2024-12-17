package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class leetCodeQ347 {
    static class  Pair implements Comparable<Pair> {
        int key;
        int freq;

        Pair(int key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        // Custom Comparable so that Heap can compare on the bases of frequencys .
        public int compareTo(Pair p) {
            return this.freq - p.freq;
        }
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 } ;
        int k = 2 ;

        HashMap<Integer , Integer> map = new HashMap<>() ;

        // Find Frequency of all ele 
        for(int i = 0 ; i < nums.length ; i++){
            int key = nums[i] ;
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq + 1) ;
            }
            else map.put(key , 1) ;
        } 

        // Store k Highest Frequency and there ele in PriorityQueue 
        // For this create Pair class to store based on Highest Frequency 
        // MinHeap 
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        for(int key : map.keySet()){
            pq.add(new Pair(key , map.get(key))) ;
            if(pq.size() > k){
                pq.remove() ;
            }
        }

        // Transfer them from Heap to Array 

        int[] ans = new int[k] ;
        for(int i = 0 ; i < k ; i++){
            Pair p = pq.remove() ;
            ans[i] = p.key ;
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
