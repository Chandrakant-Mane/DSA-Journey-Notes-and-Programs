package BinarySearch;

public class leetCodeQ410 {
    public static boolean ispossible(int[] nums , int ans , int k){
        int splits = 1 ;
        long subsum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(subsum + nums[i] <= ans){
                subsum += nums[i] ;
            }
            else{
                splits++ ;
                subsum = nums[i] ;
            } 
        }
        if(splits <= k ) return true ;
        return false ;

    }

                // Linear search (time limit will be exceded)
    // public static void main(String[] args) {
    //     int[] nums = {2,3,1,1,1,1,1} ;
    //     int k = 5  ;

    //     int mx = Integer.MIN_VALUE;
    //     int sum = 0 ;
    //     for (int i = 0; i < nums.length; i++) {
    //         mx = Math.max(mx , nums[i]) ;
    //         sum += nums[i] ;
    //     }
    //     System.out.println(mx + " " + sum);

    //     for (int i = mx; i <= sum; i++) {
    //         if(ispossible(nums , i , k)){
    //             System.out.println(i);
    //             break ;
    //         }
    //     }
    // }
                // Binary Search 
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,1,1,1} ;
        int k = 5  ;
        int mx = Integer.MIN_VALUE;
        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            mx = Math.max(mx , nums[i]) ;
            sum += nums[i] ;
        }
        int lo = mx  , hi = sum ;
        int ans = 1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2 ;
            if(ispossible(nums , mid , k)){
                ans = mid ;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(ans);
    }



}
