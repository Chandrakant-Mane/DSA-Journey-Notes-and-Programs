package SlidingWindows;

public class leetCodeQ713 {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 } ;
        int k = 100 ;

        int i = 0, j = 0;
        int prodSum = 1;
        int n = nums.length;
        int count = 0;

        while (j < n && i < n) {
            prodSum *= nums[j];
            while (i < n && prodSum >= k) {
                prodSum /= nums[i++];
            }
            count += j - i + 1;
            j++;
        }

        System.out.println(count);
    }
}
