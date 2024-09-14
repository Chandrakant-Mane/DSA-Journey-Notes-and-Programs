package AdvanceSorting;

public class quickSortAlgo {
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int partition(int[] arr , int lo , int hi){
        int pivot = arr[lo] , pivotIdx = lo ;
        int smallerCount = 0 ;
        for (int i = lo+1; i <= hi; i++) {
            if(arr[i] <= pivot) smallerCount++ ;  
        }
        int correctIdx = pivotIdx + smallerCount ;
        swap(arr ,pivotIdx , correctIdx ) ;
        // Partition 
        int i = lo , j = hi ;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] <= pivot) i++ ;
            else if(arr[j] > pivot ) j-- ;
            else if(arr[i] > pivot && arr[j] <= pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx ;
    }
    public static void quickSort(int[] arr , int lo , int hi){
        if(lo>=hi) return ;
        // pivot (arr[lo]) ko sahi jagha rekho ..
        // And left part me <= pivot 
        int idx = partition(arr,lo,hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8} ;
        print(arr);
        int n = arr.length ;
        quickSort(arr, 0 , n-1);
        print(arr);
    }
} 
