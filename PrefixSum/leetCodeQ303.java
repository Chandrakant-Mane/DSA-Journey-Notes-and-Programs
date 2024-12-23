package PrefixSum;

public class leetCodeQ303 {
    static class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            int n = nums.length;
            arr = nums;
            for (int i = 1; i < n; i++) {
                arr[i] += arr[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0)
                return arr[right];
            else
                return arr[right] - arr[left - 1];
        }
    }
    public static void main(String[] args) {
        int[] one = { -2, 0, 3, -5, 2, -1 } ;
        NumArray num = new NumArray(one) ;

        System.out.println(num.sumRange(0,2));
        System.out.println(num.sumRange(2,5));
        System.out.println(num.sumRange(0,5));
    }
}
