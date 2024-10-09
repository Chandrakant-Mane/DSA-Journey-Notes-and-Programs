package arrays;

public class leetCodeQ189 {
    private static void reverse(int[] nums, int i, int j) {
        while (i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int n = nums.length;
        int k = 4 ;
        // int x = 0 ;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        for(int i = 0 ; i < n ; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
