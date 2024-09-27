package BinarySearch;

public class leetCodeQ4M2 {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int[] nums1 , int[] nums2){
        int temp = nums1[i] ;
        nums1[i] = nums2[j] ;
        nums2[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,7,10,12};
        int[] nums2 = {2,3,6,15} ;
        int n = nums1.length;
        int m = nums2.length;
        int i = 0 , j = 0 ;
        while(i<n && j < m){
            if(nums1[i] <= nums2[j]) i++ ;
            else if(nums1[i] >= nums2[j]){
                swap(i , j , nums1 , nums2) ;
                i++ ;
            }
        }
        print(nums1);
        print(nums2);
        int x = m+n ;
        if(x%2 == 0){
            if(x/2 < n )
                System.out.println((nums1[(x/2)-1] + nums1[(x/2)]) / 2);
            else if(x/2 >= n)
                System.out.println((nums2[(x/2)-n] + nums2[(x/2)-n+1]) / 2);
            // else if(x/2 == n)
            //     System.out.println((nums1[n-1]) + (nums2[(x/2 )-n]) / 2) ;
        }
        else{
            if(x/2 <= n-1) System.out.println(nums1[x/2]);
            else if(x/2 >= n) System.out.println(nums2[(x/2) - n]);
        }
        
    }
}
