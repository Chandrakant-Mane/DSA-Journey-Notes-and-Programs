package SlidingWindows;

public class leetCodeQ1248M2 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 } ;
        int k = 2 ;
        int i = 0, j = 0, a = 0, b = 0, n = nums.length, k2 = 0;
        int count = 0;
        // Setup
        // Move 'i' to first odd number
        while (i < n && nums[i] % 2 == 0)
            i++;

        // Move 'j' to kth odd number
        while (j < n && k2 < k) {
            if (nums[j++] % 2 != 0)
                k2++;
        }
        if (k2 < k)
            System.out.println(0);
        j--;
        b = j + 1;
        while (b < n && nums[b] % 2 == 0)
            b++;
        b--;

        // Sliding Window ;
        while (b < n) {
            count += (i - a + 1) * (b - j + 1); // Math
            a = i + 1;

            i++;
            while (i < n && nums[i] % 2 == 0)
                i++;

            j = b + 1;

            b = j + 1;
            while (b < n && nums[b] % 2 == 0)
                b++;
            b--;
        }

        System.out.println(count);
    }
}
