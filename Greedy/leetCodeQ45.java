package Greedy;

public class leetCodeQ45 {
    public static int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0, l = 0, r = 0;
        while (r < n - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(i + nums[i], farthest);
            }
            l = r + 1;
            r = farthest;
            jumps += 1;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 } ;
        System.out.println(jump(nums));
    }
}
