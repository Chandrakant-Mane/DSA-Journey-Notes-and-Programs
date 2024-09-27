package BinarySearch;

public class leetCodeQ4 {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4} ;
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m] ;
        int i = 0 , j = 0 , k = 0 ;
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++] ;
            }
            else{
                arr[k++] = nums2[j++] ;
            }
        }
        while(i < n) arr[k++] = nums1[i++] ;
        while(j < m) arr[k++] = nums2[j++] ;

        int x = arr.length ;
        if(x%2 != 0) System.out.println(arr[x/2]);
        else{
            double num1 = arr[(x/2)-1] ;
            System.out.println(num1);
            double num2 = arr[(x/2)] ;
            System.out.println(num2);
            double ans = (num1 + num2)/2 ;
            System.out.println(ans);
        }
        
    }
}
