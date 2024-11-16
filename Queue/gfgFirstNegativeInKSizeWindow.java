package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class gfgFirstNegativeInKSizeWindow {
    public static void main(String[] args) {
        int[] A = {12 , -1 , -7 , 8 , -15 , 30 , 16 , 28} ;
        int k = 3 ;
        int n = A.length ;

        int[] res = new int[n-k+1] ;
        Queue<Integer> q = new LinkedList<>() ;

        // Adding index of -ve values 
        for (int i = 0; i < n; i++) {
            if(A[i] < 0){
                q.add(i) ;
            }
        }
        System.out.println(q);

        for(int i = 0 ; i < n - k + 1 ; i++){
            if(q.size() > 0 && q.peek() < i) q.remove() ;
            
            if(q.size() > 0 && q.peek() <= i+k-1){
                res[i] = A[q.peek()] ;
            }
            else if(q.size() == 0) res[i] = 0 ;
            else{
                res[i] = 0 ;
            }
        }
        
        for(int ele : A){
            System.out.print(ele + " ");
        }

        System.out.println();

        for(int ele : res){
            System.out.print(ele + " ");
        }
        
    }
}
