package BinarySearch;

public class leetCodeQ162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4} ;
        int n = nums.length;
        
        if(n==1) System.out.println(0);
        else if(nums[0] > nums[1]) System.out.println(0);
        else if(nums[n-1] > nums[n-2]) System.out.println(n-1);

        int lo = 1 , hi = n-2 ;
        while(lo<=hi){
            int mid = lo + (hi-lo) / 2 ;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) System.out.println(mid);
            else if(nums[mid+1] > nums[mid] ) lo = mid + 1 ;
            else if(nums[mid-1] > nums[mid]) hi = mid - 1 ;
        }
    }
}
