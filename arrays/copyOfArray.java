package arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {60, 50, 40, 30, 20, 10};
        for(int ele : arr){
            System.out.print(ele + "  ");
        }

        System.out.println();
        // int[] nums = arr; // shallow Copy ( same array ko new name dena)
        // nums[0] = 70 ;
        // System.out.println(arr[0]);
        // for(int i = 0 ; i < nums.length ; i++){
        //     System.out.print(nums[i]+ "  ");
        // }


        // Deep Copy 
        // M - 1 
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 80;  
        System.out.println(arr[0]); 
        System.out.println(brr[0]);

        
        // M - 2 
        int[] crr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++ ){
            crr[i] = arr[i];

        }
        crr[0] = 100;
        System.out.println(arr[0]);

    }
    
}
