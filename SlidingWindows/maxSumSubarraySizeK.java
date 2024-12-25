package SlidingWindows;

public class maxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = { 10 , 20 , 1 , 3 , -40 , 80 , 10 } ;
        int k = 3 ;
        int n = arr.length ;
        
        //      Brute Force 
        int maxSum = 0 ; 
        for(int i = 0 ; i < n-k+1 ; i++){
            int sum = 0 ; 
            for(int j = i ; j < i+k ; j++){
                sum += arr[j] ;
            }
            maxSum = Math.max(maxSum, sum) ;
        }
        System.out.println(maxSum);

        //      Sliding Window 
        int i = 0 , j = k - 1 , sum = 0  ;
        for(int x = 0 ; x < k ; x++){
            sum += arr[x] ;
        }
        maxSum = 0 ;
        i++ ; j++ ;
        while (j < n ) {
            sum = sum - arr[i-1] + arr[j] ;
            maxSum = Math.max(maxSum, sum);
            j++ ; i++ ;
        }

        System.out.println(maxSum);
    }
}
