package BinarySearch;

public class leetCodeQ4M3 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4} ;
        int n = nums1.length;
        int m = nums2.length;
        int x = m+n ;
        int ind2 = (x/2) , ind1 = ind2-1 ;
        int count = 0 ;
        int ind1ele = -1 , ind2ele = -1 ;
        int i = 0 , j = 0  ;
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                if(count == ind1) ind1ele = nums1[i] ;
                if(count == ind2) ind2ele = nums1[i] ;
                count++ ;
                i++ ;
            }
            else{
                if(count == ind1) ind1ele = nums2[j] ;
                if(count == ind2) ind2ele = nums2[j] ;
                count++ ;
                j++ ;
            }
        }
        while(i < n) {
            if(count == ind1) ind1ele = nums1[i] ;
            if(count == ind2) ind2ele = nums1[i] ;
            count++ ;
            i++ ;
        }
        while(j < m) {
            if(count == ind1) ind1ele = nums2[j] ;
            if(count == ind2) ind2ele = nums2[j] ;
            count++ ;
            j++ ;
        }
        if(x%2 == 0) System.out.println(((double)ind1ele + (double)ind2ele)/2.0);
        else System.out.println(ind2ele);
    }
}
