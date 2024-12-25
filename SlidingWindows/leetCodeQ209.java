package SlidingWindows ;

public class leetCodeQ209 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 } ;
        int target = 7 ;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;
        while (j <= n && i < n) {
            while (j < n && sum < target) {
                sum += nums[j++];
            }
            if (sum >= target) {
                minLen = Math.min(minLen, j - i);
            }
            sum -= nums[i++];
        }
        if (minLen == Integer.MAX_VALUE)
            minLen = 0;
        System.out.println(minLen);
    }
}
