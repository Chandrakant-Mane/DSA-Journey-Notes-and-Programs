package DynamicProgramming;

public class leetCodeQ198Tabulation {
    public static void main(String[] args) {
        int[] nums = { 2,7,9,3,1 } ;
        int n = nums.length;
        if (n == 1)
            System.out.println(nums[0]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
