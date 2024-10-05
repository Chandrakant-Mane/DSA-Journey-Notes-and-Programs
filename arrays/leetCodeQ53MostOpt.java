package arrays;

public class leetCodeQ53MostOpt {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4} ;
        int n = nums.length ;
        int lar = nums[0];
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i] ;
            lar = Math.max(sum , lar) ;
            if(sum < 0) sum = 0 ;
        }
        System.out.println(lar);
    
    }
}
