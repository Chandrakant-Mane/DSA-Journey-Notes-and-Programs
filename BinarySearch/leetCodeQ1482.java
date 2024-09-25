package BinarySearch;

public class leetCodeQ1482 {
    public static int max(int[] nums , int mx){
        for(int ele : nums){
            mx = Math.max(ele , mx) ;
        }
        return mx ;
    }
    public static boolean ispossible(int[] nums , int m , int k , int n , int days){
        // int count = 0 ;
        // for(int i = 0 ; i < n ; i++){
        //     if(nums[i] == days) count++ ;
        //     else if(nums[i] / days == 0) count++ ;
        // }
        // if(count >= m){
            // System.out.println(" I am Here and count is " + count + " and mid is " + days);
            int adj = 0 ;
            for (int j = 0; j < n; j++) {
                // if(adj == k) m-- ;
                // System.out.println(" adj is " + adj);
                if(nums[j] == days){
                    adj++ ;
                    if(adj == k){
                        m-- ;
                        adj = 0 ;
                    } 
                } 
                else if(nums[j] / days == 0){
                    adj++ ;
                    if(adj == k){
                        m-- ;
                        adj = 0 ;
                    } 
                } 
                else adj = 0 ;
            }
            // System.out.println(" m is " + m);
            
        // }
        if(m<=0) return true ;
        return false ;

    }
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7} ;
        int n = bloomDay.length ;
        int m = 2 , k = 3 ;
        int mx = Integer.MIN_VALUE ;
        mx = max(bloomDay , mx) ;
        // System.out.println("max is" +mx);
        int lo = 1 , hi = mx ;
        int ans = -1 ;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(ispossible(bloomDay , m , k , n , mid)){
                // System.out.println("This is mid " + mid);
                ans = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1; 
        }
        System.out.println(ans);
    }
}
