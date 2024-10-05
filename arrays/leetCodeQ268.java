package arrays;

public class leetCodeQ268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1} ;
        int n = nums.length ;
        int sum = n * (n+1)/2 ;
        int sm = 0 ;
        for (int i = 0; i < n; i++) {
            sm += nums[i] ;
        }
        System.out.println(sum-sm);
    }
}
