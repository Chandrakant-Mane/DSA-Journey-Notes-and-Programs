package Heaps ;

import java.util.Scanner;

public class minHeapImplementationByArray {
    static class MinHeap{
        private int[] arr ;
        private int size ;
        MinHeap(int capacity){
            this.arr = new int[capacity] ;
            size = 0 ;
        }
 
        void add(int num) throws Exception{
            if(size == arr.length){
                throw new Exception("Bhai Heap Full Ho Gaya Hai...") ;
            }
            arr[size++] = num ;
            upheapify(size - 1) ;
        }

        void upheapify(int idx){
            if(idx == 0) return  ;
            int p = (idx - 1)/2 ;
            if(arr[idx] < arr[p]){
                swap(idx , p) ;
                upheapify(p);
            }
        }

        void swap(int i , int j){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
        }

        void display(){
            for(int i = 0 ; i < size ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int peek() throws Exception {
            if(size == 0){
                throw new Exception("Bhai Heap Empty Hai Pehile Kuch Add kr le") ;
            }
            return arr[0] ;
        }

        public int size(){
            return size ;
        }

        public int remove() throws Exception{
            if(size == 0) throw new Exception("Bhai Heap Empty Hai Pehile Kuch Add kr le") ;
            int peek = arr[0] ;
            swap(0 , size-1) ;
            size-- ;
            downHeapify(0) ;
            return peek ;
        }

        void downHeapify(int i){
            if(i >= size-1 ) return ;
            int lc = 2 * i + 1 ;
            int rc = 2 * i + 2 ;
            int minIdx = i ;
            
            if (lc < size && arr[lc] < arr[minIdx])
                minIdx = lc;

            if(rc < size && arr[rc] < arr[minIdx] ) 
                minIdx = rc ;

            if(i == minIdx) return ;

            swap(i, minIdx);
            downHeapify(minIdx);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Heap Length : "); 
        int n = sc.nextInt() ;
        MinHeap pq = new MinHeap(n) ;
        // System.out.println("Peek ele is : " + pq.peek());

        pq.add(1) ;

        pq.add(6) ;
        System.out.println("Peek ele is : " + pq.peek());
        System.out.println("Heap size is : " + pq.size());
        pq.add(0) ;
        pq.add(2) ; 
        System.out.println("Heap size is : " +  pq.size());

        pq.display();

        System.out.println("Peek ele is : " + pq.peek());

        pq.add(-4);
        System.out.println("Peek ele is : " + pq.peek());

        pq.display();

        System.out.println(pq.remove());

        pq.display();

        System.out.println(pq.remove());
        pq.display();

        sc.close();
        
    }
}
