package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetCodeQ239 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        if(nums == null || k <= 0)
            System.out.println(new int[0]);
        int n = nums.length ;
        int[] res = new int[n-k+1] ;
        int resi = 0 ;

        Deque<Integer> q = new ArrayDeque<>() ;

        for(int i = 0 ; i < n ; i++){
            while(!q.isEmpty() && q.peek() < i - k + 1 ) // remove out of window elements 
                q.poll() ;

            // remove smaller elements from right hand side 

            while(!q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.pollLast() ;
            q.offer(i) ;
            if(i >= k-1){
                res[resi++] = nums[q.peek()] ;
            }
        }

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
