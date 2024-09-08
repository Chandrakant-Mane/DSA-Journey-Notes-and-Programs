package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70} ;  
        int n = arr.length ;
        int target = 30 ; 
        int up = n ; 
        int lo = 0 , hi = n - 1 ; 
        while (lo <= hi) {
            int mid = lo+(hi - lo)/2 ;
            if(arr[mid] > target){
                up = Math.min(up , mid) ;
                hi = mid-1 ;
            }
            else  lo = mid + 1 ; 
            
        }
        System.out.println(up);
    }
}
