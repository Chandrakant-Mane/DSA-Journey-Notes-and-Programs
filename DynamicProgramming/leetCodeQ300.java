package DynamicProgramming ;

public class leetCodeQ300 {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i], dp[j]);
            }
            dp[i] += 1;
            ans = Math.max(dp[i], ans);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 } ;
        System.out.println(lengthOfLIS(nums));
    }
}
