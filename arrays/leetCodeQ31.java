package arrays;

public class leetCodeQ31 {
    public static void reverse(int[] arr , int i , int j){
        while(i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++ ; 
            j-- ;
        }
    }
    public static  void nextPermutation(int[] nums) {
        int ind = -1 ;
        int n = nums.length;
        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                ind = i ;
                break ;
            }
        }
        if(ind == -1){
            reverse(nums , 0 , n-1);
        }
        else{
            for(int i = n-1 ; i > ind ; i--){
                if(nums[i] > nums[ind]){
                    int temp = nums[i] ;
                    nums[i] = nums[ind] ;
                    nums[ind] = temp ;
                    break ;
                }
            }
        reverse(nums, ind+1 , n-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1} ;
        nextPermutation(nums);
        for(int ele : nums){
            System.out.print(ele + " ");
        }

    }
}
