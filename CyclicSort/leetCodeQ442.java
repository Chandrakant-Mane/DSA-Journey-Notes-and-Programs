package CyclicSort;

import java.util.ArrayList;

public class leetCodeQ442 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1} ;
        int n = nums.length ;
        // int[] ans = new int[2] ;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0 ;
        print(nums);
        while(i < n){
            if(nums[i] == i+1 || nums[i] == nums[nums[i]-1]) i++ ;
            else swap(i , nums[i]-1 , nums) ; 
        }
        print(nums);
        // int j = 1 ;
        for(i = 0 ; i < n ; i++){
            if(nums[i] != i+1){
                ans.add(nums[i]) ;
                // j-- ;
                // ans[1] = i+1 ;
            } 
        }
        System.out.println(ans);
    }
}
