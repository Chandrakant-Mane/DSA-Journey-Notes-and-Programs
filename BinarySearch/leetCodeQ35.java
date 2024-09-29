package BinarySearch ;

public class leetCodeQ35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6} ;
        int target = 5 ;
        int n = nums.length ;
        int lo = 0 , hi = n-1 ;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(nums[mid] == target){
                System.out.println(mid);
            }
            else if(nums[mid] > target) hi = mid - 1 ;
            else if(nums[mid] < target) lo = mid + 1 ;
        }
        System.out.println(hi+1);
    }
}