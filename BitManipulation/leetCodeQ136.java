package BitManipulation;

public class leetCodeQ136 {
    public static int singleNumber(int[] nums) {
        // Method 3 : Using XOR
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = { 4 , 1 , 2 , 1 , 2} ;
        System.out.println(singleNumber(nums));
    }
}
