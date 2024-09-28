package BinarySearch;


public class leetCodeQ81 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1} ;
        int target = 2 ;
        int n = arr.length ; 
        int lo = 0 , hi = n-1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==target){
                System.out.println("true");
                break ;
            }
            else if(arr[mid] == arr[hi] && arr[mid] == arr[lo]){
                lo++ ;
                hi-- ;
                continue ;
            }
            else if(arr[mid] <= arr[hi]){ // I am in Right Sorted array (mid to high everything is sorted )
                if(target>arr[mid] && target <= arr[hi]) lo = mid + 1 ;
                else hi = mid - 1 ;
            }
            else{  // I am in Left Sorted array (lo to mid everything is sorted )
                if(target >= arr[lo] && target < arr[mid]) hi = mid - 1 ;
                else lo = mid + 1 ;
            }
        }
        System.out.println("false"); 

    }
}
