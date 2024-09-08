package BinarySearch;

public class leetCodeQ875 {
    public static boolean isPossible(int minP , int[] piles , int h  ){
        long x = 0 ;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]%minP == 0) x += piles[i]/minP ;
            else x += piles[i]/minP + 1;
        }
        if(x > h) return false ;
        else return true ;
    }
    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368} ;
        int n = piles.length ;
        int h = 1000000000 ;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, piles[i]) ;
        }
        int ans = 0 ;
        int lo = 1 , hi = mx ;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2 ;
            System.out.println(mid);
            if(isPossible(mid , piles , h )){
                ans = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1;
        }
        System.out.println(ans);
    }
}
