package CyclicSort;

import java.util.ArrayList;

public class leetCodeQ448 {
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int n = nums.length ;
        int i = 0 ;
        while(i<n){
            int ele = nums[i]; // ele should be at ele-1 index 
            if(nums[i] == i + 1 || nums[i] == nums[ele-1] ) i++ ;
            else{
                swap(i,ele - 1,nums) ;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for ( i = 0; i < n; i++) {
            if(nums[i]!=i+1 ) ans.add(i+1);
        }
        System.out.println(ans);
    }

}
