package CyclicSort;

public class leetCodeQ645 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,3,2,2,7,6,4,8,9} ;
        int n = nums.length ;
        int[] ans = new int[2] ;
        int i = 0 ;
        print(nums);
        while(i < n){
            if(nums[i] == i+1 || nums[i] == nums[nums[i]-1]) i++ ;
            else swap(i , nums[i]-1 , nums) ; 
        }
        print(nums);
        for(i = 0 ; i < n ; i++){
            if(nums[i] != i+1){
                ans[0] = nums[i]  ;
                ans[1] = i+1 ;
            } 
        }
        print(ans);
    }
}
