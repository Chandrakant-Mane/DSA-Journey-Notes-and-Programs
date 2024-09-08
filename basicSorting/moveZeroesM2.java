package basicSorting;

public class moveZeroesM2 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length ;
        int noz = 0 ; 
        for(int ele : nums){
            if(ele == 0) noz++ ;
        }
        for(int x = 0 ; x < noz ; x++ ){        // noz Passes
            for (int i = 0; i < n-1-x; i++) {
                if(nums[i] == 0){
                    int temp = nums[i] ;
                    nums[i] = nums[i+1] ;
                    nums[i+1] = temp ; 
                }
                
            }
        }
  
    }
    
}
