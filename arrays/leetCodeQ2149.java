package arrays;

public class leetCodeQ2149 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 } ;
        int n = nums.length;
        int[] ans = new int[n];
        int pidx = 0;
        int nidx = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[nidx] = nums[i];
                nidx += 2;
            } else {
                ans[pidx] = nums[i];
                pidx += 2;
            }
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
