package DynamicProgramming;

import java.util.Arrays;

public class leetCodeQ198Memo {
    public static int amount(int[] nums, int idx, int[] dp) {
        if (idx >= nums.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        int take = nums[idx] + amount(nums, idx + 2, dp);
        // dp[idx] = take ;
        int skip = amount(nums, idx + 1, dp);
        dp[idx] = Math.max(take, skip);
        return Math.max(take, skip);
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 } ;
        int n = nums.length ;
        int[] dp = new int[n] ; //  'i' varies from 0 to n-1 ;
        Arrays.fill(dp,-1) ;
        System.out.println(amount(nums, 0, dp));
    }
}
