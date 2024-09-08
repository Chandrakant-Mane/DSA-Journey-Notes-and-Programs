package BinarySearch;

public class leetCodeQ2064 {
    public static boolean isPossible(int maxQ , int n , int[] arr) {
        int stores = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%maxQ == 0) stores += arr[i]/maxQ ;
            else stores += arr[i]/maxQ + 1;
        }
        if(stores>n) return false ;
        else return true ;
    }
    public static void main(String[] args) {
        int[] arr = {15,10,10} ;
        int n = 7 ; 
        int m = arr.length , mx = Integer.MIN_VALUE ;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int lo = 1 , hi = mx;
        int ans = 0 ;
        while (lo <= hi) {
            int mid = lo + (hi - lo )/2 ;
            if(isPossible(mid,n,arr)){
                ans = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1 ;
        }
        System.out.println(ans);
    }
}
