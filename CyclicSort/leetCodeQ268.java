package CyclicSort;

public class leetCodeQ268 {
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length ;
        int i = 0 ;
        while(i<n){
            if(nums[i] == i || nums[i] == n) i++ ;
            else{
                swap(i,nums[i],nums) ;
            }
        }
        for ( i = 0; i < n; i++) {
            if(nums[i]!=i) System.out.print(i);
        }
    }

}
