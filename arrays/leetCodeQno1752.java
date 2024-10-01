package arrays;

public class leetCodeQno1752 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4} ;
        int n = nums.length; 
        int count = 0 ;
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] > nums[i+1]){
                count++ ;
            }
        }
        if(count > 0){
            if(count >= 2) System.out.println(false); 
            else if(nums[n-1] > nums[0]) System.out.println(false); 
            else System.out.println(true);
        }
         
    }
}
