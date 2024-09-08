package BinarySearch;

public class leetCodeQ1011 {


    public static boolean isPossible(int c , int[] arr , int d) {
        int n = arr.length ; 
        int load = 0 ; 
        int days = 1 ;
        for (int i = 0; i < n; i++) {
            if(load + arr[i] <= c) load += arr[i] ;
            else {
                load = arr[i] ;
                days++ ;
            }
        }
        if(days > d) return false ;
        else return true ;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int d = 5 ;
        int n = arr.length ;
        int sum = 0 , mx = Integer.MIN_VALUE ;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]) ;
            sum += arr[i] ;
        }
        int lo = mx , hi = sum , minC = sum ;
        while(lo<=hi) {     //  TC = O(n*log(sum-mx))
            int mid = lo + (hi - lo)/2 ;
            if(isPossible(mid , arr , d)==true){
                minC = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1 ;
        }
        System.out.println(minC);

    }

}
