package arrays;

public class leetCodeQ75 {
    public static void main(String[] args) {
        // Q. Sort the array of 0's , 1's and 2's . (Dutch Flag Algorithm )

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;

        // Method - 1 
        int noOfZeros = 0 , noOfOnes = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0)
                noOfZeros++;
            if(arr[i]==1)
                noOfOnes++;
            // else
            //     noOfTwos++;
        }
        // System.out.println(noOfZeros);
        // System.out.println(noOfOnes);
        // System.out.println(noOfTwos);
        
        for(int i = 0 ; i < n ; i++){
            if(i < noOfZeros)
            arr[i] = 0 ;
            else if(i < noOfZeros + noOfOnes)
            arr[i] = 1 ;
            else
            arr[i] = 2 ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
