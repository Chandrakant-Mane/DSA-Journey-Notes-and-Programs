package arrays;

public class leetCodeQ136 {
    public static void main(String[] args) {
        int[] nums = {1,0,1} ;
        int n = nums.length ;
        // int count = 0 ;
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < n ; j++){
        //         if(nums[i] == nums[j]) count++ ;
        //     }
        //     if(count == 1) System.out.println(nums[i]) ; 
        //     else count = 0 ;
        // }
        int xor = 0 ;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i] ;
        }
        System.out.println(xor);
    }
}
