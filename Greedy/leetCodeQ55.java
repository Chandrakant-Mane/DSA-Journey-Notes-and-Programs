package Greedy ;

public class leetCodeQ55 {
    public static boolean canJump(int[] nums) {
        int maxIdx = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (maxIdx < i)
                return false;
            maxIdx = Math.max(maxIdx, i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2 , 3 , 1 , 1 , 4} ;
        int[] nums1 = { 3 , 2 , 1 , 0 , 4 } ;

        System.out.println(canJump(nums));
        System.out.println(canJump(nums1));
    }
}
