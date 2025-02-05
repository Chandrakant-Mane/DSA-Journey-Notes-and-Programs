package Greedy;

import java.util.Arrays;

public class minimumCostToCutBoard {
    public static int minimumCostOfBreaking(int[] X , int[] Y , int M , int N ) {
        // code here
        int res = 0 ;
        
        // Sort the Horizontal Cost in reverse Order .
        Arrays.sort(X) ;
        // Sort the Vertical Cost in reverse Order .
        Arrays.sort(Y) ;
        
        int hzntl = 1 , vert = 1 ;
        
        int i = M-2 , j = N-2 ;
        
        while(i >= 0 && j >= 0){
            if(X[i] > Y[j]){
                res += X[i] * vert ;
                // Increase Current horizontal part count by 1 .
                hzntl++ ;
                i-- ;
            }
            else{
                res += Y[j] * hzntl ;
                // Increase Current Vertical part count by 1 ;
                vert++ ;
                j-- ;
            }
        }
        while(i >= 0){
            res += X[i] * vert ;
            // Increase Current horizontal part count by 1 .
            hzntl++ ;
            i-- ;
        }
        while(j >= 0){
            res += Y[j] * hzntl ;
            // Increase Current Vertical part count by 1 ;
            vert++ ;
            j-- ;
        }
        
        return res ;
        
    }
    public static void main(String[] args) {
        int[] X =  { 2, 1, 3, 1, 4 } ;
        int[] Y =  { 4, 1, 2 } ;

        int M = 6 , N = 4 ;

        System.out.println(minimumCostOfBreaking(X, Y, M, N));

    }
}
