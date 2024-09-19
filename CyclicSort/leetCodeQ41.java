package CyclicSort;

import java.util.HashSet;

public class leetCodeQ41 {
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1} ;
        int n = nums.length ;
        HashSet<Integer> set = new HashSet<>() ;
        for(int ele : nums ){
            set.add(ele) ;
        }
        for(int num = 1 ; num <= n+1 ; num++){
            if(!set.contains(num)){
                System.out.println(num);
                break ;
            }  
        }
        

            // M  -  1    ( it will show time limit exceeded error)
        // for (int num = 1; num <= n+1; num++) {
        //     boolean flag = false ;
        //     for(int ele : nums){
        //         if(ele==num){
        //             flag = true ;
        //             break ;
        //         }
        //     }
        //     if(flag == false){
        //         System.out.println(num);
        //         break ;
        //     } 
        // }
    }
}
