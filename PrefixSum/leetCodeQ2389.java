package PrefixSum;

import java.util.Arrays;

public class leetCodeQ2389 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 2, 1 } ;
        int[] queries = { 3, 10, 21 } ;
        Arrays.sort(nums) ;
        int n = nums.length ;
        for(int i = 1 ; i < n ; i++){
            nums[i] += nums[i-1] ;
        }
        for(int i = 0 ; i < queries.length ;i++){
            int maxlen = 0 ;
            int lo = 0 , hi = n-1 ;
            while(lo <= hi){
                int mid = lo + (hi-lo) / 2 ;
                if(nums[mid] <= queries[i]){
                    maxlen = Math.max(maxlen , mid+1) ;
                    lo = mid+1 ;
                }
                else
                    hi = mid-1 ;
            }
            queries[i] = maxlen ;
        }

        for(int ele : queries){
            System.out.print(ele + " ");
        }
    }
}
