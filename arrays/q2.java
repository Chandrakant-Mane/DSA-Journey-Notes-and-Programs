package arrays;

public class q2 {
    public static void main(String[] args) {

        // Using New array 
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int n = nums.length;
        int k = 2 ;
        int x = 0 ;
        k = k%n;
        int[] brr = new int[n] ;
        for(int i = n-k ; i <= n-1 ; i++){
            brr[x] = nums[i];
            System.out.print(brr[x]+ " ");
            x++ ;
            }
        for(int j = 0 ; j < n-k ; j++){
            brr[x] = nums[j];
            System.out.print(brr[x] + " ");
            x++;
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++){
            nums[i] = brr[i];
            System.out.print(nums[i]+ " ");
        }
        }
   
    }
            
