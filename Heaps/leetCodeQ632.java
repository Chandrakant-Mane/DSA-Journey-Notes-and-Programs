package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class leetCodeQ632 {
    static class Triplet implements Comparable<Triplet>{
        int ele ; 
        int row ;
        int col ;
        Triplet(int ele , int row , int col){
            this.ele = ele ;
            this.row = row ;
            this.col = col ;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele ;
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>(Arrays.asList(
            Arrays.asList(4, 10, 15, 24, 26), 
            Arrays.asList(0, 9, 12, 20), 
            Arrays.asList(5, 18, 22, 30)
        ));

        int[] ans = { 0, Integer.MAX_VALUE };
                // Create MinHeap of Triplet.
                // Triplet contains ele , row and col and set the comparable to ele .
        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
                // Insert first ele(Triplet(ele , row , col)) of all Lists present in 2-D list .
                // Also store the max ele from ele's we are inserting in heap .
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);
        }
                // Every time we will remove one smallest ele triplet from heap . Store ele ,
                // row , col in new varable .
                // then check if diff of new range(max - ele) < diff of previous range . Then
                // update the range .
                // Now we will to add newEle(with row & col) to heap which is just next to
                // stored ele . we will find newEle using row and col.
                // but before adding check is there and newEle if Not then break the loop .
                // After adding new triplet also update if max if newEle is greater than max .

        while (true) {
            Triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            // Update the minimum range
            if (max - ele < ans[1] - ans[0]) {
                ans[0] = ele;
                ans[1] = max;
            }
            if (col == nums.get(row).size() - 1)
                break;
            int next = nums.get(row).get(col + 1);
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col + 1));
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
       
    }
}
