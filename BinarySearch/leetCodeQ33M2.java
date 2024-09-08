package BinarySearch;

public class leetCodeQ33M2 {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2} ;
        int target = 10 ;
        int n = arr.length ; 
        int lo = 0 , hi = n-1 ;
        boolean flag = true ; 
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==target){
                System.out.println(mid);
                flag = false ;
                break ;
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
        if(flag == true)
        System.out.println(-1); ;

        
    }
}
