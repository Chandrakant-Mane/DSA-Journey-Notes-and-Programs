package AdvanceSorting;

public class leetCodeQ215 {
    static int ans ;
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
    public static void quickSelect(int[] arr , int lo , int hi , int k){
        if(lo>hi) return ;
        // if(lo==hi){  //  Not Really Required .
        //     if(lo==k-1 )  ans = arr[lo]; 
        //     return ;
        // }
        // pivot (arr[lo]) ko sahi jagha rekho ..
        // And left part me <= pivot 
        int idx = partition(arr,lo,hi);
        if(idx == k-1){
            ans = arr[idx];
            return ;
        }
        if(k-1 < idx){
            quickSelect(arr, lo, idx-1 , k);
        }
        else 
        quickSelect(arr, idx+1, hi , k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,6,5,8} ;
        print(arr);
        int k = 2  ;
        ans = -1 ;
        int n = arr.length ;
        quickSelect(arr, 0 , n-1 , n-k+1);
        print(arr);
        System.out.println(ans);
    }
}
