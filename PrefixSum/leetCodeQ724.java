package PrefixSum;

public class leetCodeQ724 {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 } ;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            if (i > 0)
                leftSum = nums[i - 1];
            int rightSum = nums[n - 1] - nums[i];
            if (leftSum == rightSum)
                System.out.println(i);;
        }
        
    }
}
