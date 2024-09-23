package BinarySearch;

public class leetCodeQ540 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8} ;
        int n = nums.length ;
        if(n == 1) System.out.println(nums[0]);
        else if(nums[0] != nums[1]) System.out.println(nums[0]); 
        else if(nums[n-1] != nums[n-2]) System.out.println(nums[n-1]); 
        int lo = 1 , hi = n-2 ;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                System.out.println(nums[mid]);
                break ;
            } 
            else if(nums[mid] != nums[mid-1] && nums[mid] == nums[mid+1]){
                if(mid%2 == 0) lo = mid + 1 ;
                else hi = mid - 1 ;
            }
            else if(nums[mid] == nums[mid-1] && nums[mid] != nums[mid+1]){
                if((mid-1)%2 == 0) lo = mid + 1 ;
                else hi = mid - 1 ;
            }
        }
        
    }
}
