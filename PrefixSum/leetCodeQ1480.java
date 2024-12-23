package PrefixSum;

public class leetCodeQ1480 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 } ;

        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] += sum;
            sum = nums[i];
        }
        
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
