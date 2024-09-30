package BinarySearch;

public class leetCodeQ4M2 {
    public static double ans(int[] nums1 , int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        if(n > m) return ans(nums2 , nums1) ;
        int lo = 0 , hi = n ;
        System.out.println(hi);
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2 ;
            int mid2 = left - mid ;
            int mid1 = mid ;
            System.out.println("mid is " + mid);
            int l1 = Integer.MIN_VALUE , l2 = Integer.MIN_VALUE ;
            int r1 = Integer.MAX_VALUE , r2 = Integer.MAX_VALUE ;
            if(mid1 < n)  r1 = nums1[mid1] ;
            if(mid2 < m)  r2 = nums2[mid2] ; 
            if(mid1 - 1 >= 0 ) l1 = nums1[mid1 - 1]  ;
            if(mid2 - 1 >= 0 ) l2 = nums2[mid2 - 1] ;
            
            if(l1 <= r2 && l2 <= r1){
                if((m+n)%2 == 0){
                   return (double)(Math.max(l1,l2) + Math.min(r1,r2)) / 2.0 ;
                } 
                else{
                    return (Math.max(l1, l2));
                }
            }
            else if(l1 > r2) hi = mid1 - 1;
            else lo = mid1 + 1 ;    
        }
        return - 1;

    }
    

    public static void main(String[] args) {
        int[] nums2 = { 1, 3, 4, 7, 10, 12 };
        int[] nums1 = { 2, 3, 6, 15 };
        System.out.println(ans(nums1 ,nums2));

    }
}
