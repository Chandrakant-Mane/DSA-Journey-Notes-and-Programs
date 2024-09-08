package BinarySearch;

public class leetCodeQ74M2 {
    public static void main(String[] args) {
       int[][] arr = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}} ;
       int target = 3 ;
       int m = arr.length ;
       int n = arr[0].length ;
       int i = 0 , j = m*n-1;
       while(i<=j){
            int mid = i + (j - i)/2 ;
            int row = mid/n ;
            int col = mid%n ;

            if(arr[row][col] == target) System.out.println("True"); 
            else if(arr[row][col] < target)   i = mid + 1 ;
            else j = mid - 1 ;

       }
       System.out.println("False");
    }
}
