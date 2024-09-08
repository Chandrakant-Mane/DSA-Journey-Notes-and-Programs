package BinarySearch;

public class leetCodeQ1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11} ;
        int k = 5 ;
        int lo = 0 , hi = arr.length-1 ;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2 ;
            int missed = arr[mid] - (mid+1) ;
            if(missed < k) lo = mid + 1;
            else hi = mid - 1;
        }
        System.out.println(k+lo);
    }
}
