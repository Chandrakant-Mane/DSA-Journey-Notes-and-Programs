package PrefixSum;

public class leetCodeQ2640 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 5, 10 } ;
        int n = nums.length;
        long[] ans = new long[n];
        long max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            ans[i] = nums[i] + max;
            if (i > 0)
                ans[i] += ans[i - 1];
        }
        
        for(long ele : ans){
            System.out.print(ele + " ");
        }
    }
}
