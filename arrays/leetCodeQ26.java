package arrays;

public class leetCodeQ26 {
    public static void print(int[] nums){
        for(int ele : nums){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4,4,4,5} ;
    int n = nums.length ;
    int i = 0 , j = 0 ;
    int k = 1 ;
    while( i<n && j<n ){
        if(nums[i] == nums[j]){
            j++ ;
        }
        // if(j<n) break ;
        else{
            swap(i + 1 , j , nums) ;
            k++ ;
            j++ ;
            i++ ;
        }
        System.out.println(" j is : " + j);
        
    }
    print(nums);
    System.out.println(k);
}
}
