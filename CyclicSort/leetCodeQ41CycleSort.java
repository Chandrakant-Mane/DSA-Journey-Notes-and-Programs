package CyclicSort;

public class leetCodeQ41CycleSort {
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1} ;
        int n = nums.length ; 
        int i = 0 ;
        while(i<n){
            int ele = nums[i] ;  // ele will be placed at ele-1 idx 
            if(ele <= 0  ||  ele == i+1  ||  ele > n  ||  ele == nums[ele-1])  i++ ;
            else swap(i , ele-1 , nums ) ;
        }
        for(i=0 ; i < n ; i++){
            if(nums[i] != i+1) System.out.println(i+1);
        }
    }
}
 