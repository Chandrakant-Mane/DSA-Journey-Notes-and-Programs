package DynamicProgramming;

public class leetCodeQ416 {
            // Recursion + Memoization   T.C  &  A.S  ==>  O (n * t) .
    public static boolean subset(int[] arr, int target, int idx, int[][] dp) {
        if (idx == arr.length) {
            if (target == 0)
                return true;
            else
                return false;
        }
        if (dp[idx][target] != -1)
            return (dp[idx][target] == 1);
        boolean ans = false;
        boolean skip = subset(arr, target, idx + 1, dp);
        if (target - arr[idx] < 0)
            ans = skip; // Only Valid for +ve No.
        else {
            boolean take = subset(arr, target - arr[idx], idx + 1, dp);
            ans = skip || take;
        }
        dp[idx][target] = (ans) ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 5, 11, 5 } ;

        int sum = 0;
        for (int ele : nums)
            sum += ele;

        int[][] dp = new int[nums.length][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        if (sum % 2 == 1)
            System.out.println(false);
        else 
            System.out.println(subset(nums, sum/2, 0, dp));

    }
}
