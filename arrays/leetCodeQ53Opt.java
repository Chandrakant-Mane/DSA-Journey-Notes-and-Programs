package arrays;

public class leetCodeQ53Opt {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4} ;
        int n = nums.length ;
        int lar = Integer.MIN_VALUE ;
        int sum = 0 ;
        if(n == 1) System.out.println(nums[0]);;
        for(int i = 0 ; i <= n-1 ; i++){
            sum = 0 ;
            for(int j = i ; j <= n-1 ; j++){
                sum += nums[j];
                lar = Math.max(lar , sum);  
            }  
        }
        System.out.println(lar);
    }
    
}
