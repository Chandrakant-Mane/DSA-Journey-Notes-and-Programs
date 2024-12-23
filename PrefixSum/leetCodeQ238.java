package PrefixSum;

public class leetCodeQ238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 } ;
        int n = nums.length;
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                pre[0] = 1;
            else
                pre[i] = pre[i - 1] * nums[i - 1];
        }
        int suf = 1;
        for (int i = n - 2; i >= 0; i--) {
            suf *= nums[i + 1];
            pre[i] *= suf;
        }
        for(int ele : pre){
            System.out.print(ele + " ");
        }
    }
}
