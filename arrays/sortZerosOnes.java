package arrays;

public class sortZerosOnes {
    public static void main(String[] args) {

        // M - 2  [ To Pass Solution ]
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0};
        int noOfZeroes = 0 , noOfOnes = 0 ;
        
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] == 0)  noOfZeroes++;
            else  noOfOnes++ ;
        }
        System.out.print(noOfZeroes + " ");
        System.out.println(noOfOnes + " ");
        for(int i = 0 ; i < arr.length ; i++){
            if(i < noOfZeroes){
                arr[i] = 0 ; 
            }
            else
                arr[i] = 1 ;
            }
            
        // for(int j = 0 ; j < arr.length ; j++){
        //     System.out.print(arr[j] + " ");
        // }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    
}
}
