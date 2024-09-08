package BinarySearch;

public class leetCodeQ2187 {
    public static boolean isPossible(long mid , int[] time , int totalTrips){
        long trips = 0 ;
        for (int i = 0; i < time.length; i++) {
            trips += mid/time[i] ;
        }
        if(trips>=totalTrips) return true ;
        else return false ;
    }
    public static void main(String[] args) {
        int[] time = {66};
        long n = time.length ;
        int totalTrips = 8295 ;
        long mx = Integer.MIN_VALUE ;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, time[i]);
        }
        long ans = 0 ;
        long lo = 1 , hi = mx*totalTrips ;
        while(lo <= hi){
            long mid = lo + (hi - lo)/2 ;
            if(isPossible(mid , time , totalTrips)){
                ans = mid ;
                hi = mid - 1;
            }
            else lo = mid + 1 ;
        }
        System.out.println(ans);;
    }
}
