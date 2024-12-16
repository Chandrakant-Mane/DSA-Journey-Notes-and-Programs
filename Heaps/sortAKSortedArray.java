package Heaps;

import java.util.PriorityQueue;

public class sortAKSortedArray {
    public static void main(String[] args) {
        int[] arr = { 6 , 5 , 3 , 2 , 8 , 10 , 9 } ;
        int n = arr.length ;
        int k = 3 ;

        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        int idx = 0 ;
        for(int i = 0 ; i < n ; i++){
            pq.add(arr[i]) ;
            if(pq.size() > k){
                arr[i] = arr[idx] ;
                arr[idx] = pq.remove() ;
                idx++ ;
            }
        }
        // for(int i = idx ; i < n ; i++) {
        //     arr[i] = pq.remove() ;
        // }
        while (pq.size() > 0) {
            arr[idx] = pq.remove() ;
            idx ++ ;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
