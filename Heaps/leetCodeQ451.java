package Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class leetCodeQ451 {
    static class Pair implements Comparable<Pair> {
        char key;
        int freq;

        Pair(char key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        // Custom Comparable so that Heap can compare on the bases of frequencys .
        public int compareTo(Pair p) {
            return this.freq - p.freq;
        }
    }
    public static void main(String[] args) {
        String s = "tree" ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            if(map.containsKey(ch)){
                int freq = map.get(ch) ;
                map.put(ch , freq + 1) ;
            }
            else map.put(ch , 1) ;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        String ans = "" ;
        for(char key : map.keySet()){
            pq.add(new Pair(key , map.get(key))) ;
        }
        while(pq.size() > 0){
            Pair p = pq.remove() ;
            char ch = p.key ;
            int freq = p.freq ;
            for(int i = 0 ; i < freq ; i++){
                ans += ch ;
            }
        }

        System.out.println(ans);
    }
}
