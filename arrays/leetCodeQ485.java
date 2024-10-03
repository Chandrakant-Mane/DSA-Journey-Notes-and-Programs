package arrays;

public class leetCodeQ485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1} ;
        int n = nums.length;
        int ones = 0 ;
        int i = 0 ;
        int ans = 0 ;
        while(i < n){
            if(nums[i] == 1){
                ones++;
                if(ans < ones) ans = ones ;
                i++ ;
            }
            else{
                if(ans < ones) ans = ones ;
                ones = 0 ;
                i++ ;
            }
        }
        System.out.println(ans);
    }
}
