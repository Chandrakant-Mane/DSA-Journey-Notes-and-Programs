package arrays;

public class leetCodeQ75M2 {
    public static void swap(int[] arr, int mid , int lo){
        int temp = arr[mid];
        arr[mid] = arr[lo];
        arr[lo] = temp ;
    }
    public static void main(String[] args) {
         // Q. Sort the array of 0's , 1's and 2's . (Dutch Flag Algorithm )

         int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
         int n = arr.length;
            // Method - 2 ( Dutch Flag Algorithm )
         int mid = 0 , hi = n-1 , lo = 0 ;
         while(mid <= hi ){
            if(arr[mid] == 0){
                swap(arr,mid,lo);
                lo ++ ; mid ++ ;
            }
        
            else if(arr[mid] == 1)  mid++;
            else{
                swap(arr,mid,hi);
                hi-- ;

            }
            
        } 
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }    
    }
    
}
