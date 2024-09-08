package BinarySearch;

public class leetCodeQ74 {
    public static void main(String[] args) {
        int[][] arr = {{1}} ;
        int m = arr.length , n = arr[0].length ;
        int target = 2 ;
        int lo1 = 0 , i = m-1 ;
        while(lo1 <= i){
           int mid1 = lo1 + (i - lo1)/2 ;
           if(arr[mid1][0] == target){
               System.out.println("true");
               break ;
        } 
           else if(arr[mid1][0] > target) i = mid1 - 1 ;
           else if(arr[mid1][0] < target) lo1 = mid1 + 1;
        }
        
        int j = n-1 ; 
        int lo2 = 0 ;
        while(lo2<=j){
            if(i<0 || i>=m){
                System.out.println(false); 
                break ;
            }
            int mid2 = lo2 + (j - lo2)/2 ;
            if(arr[i][mid2] == target){
                System.out.println("true");
                break ;
            } 
            else if(arr[i][mid2] < target) lo2 = mid2 + 1 ;
            else if(arr[i][mid2] > target) j = mid2 - 1 ; 
        }
        System.out.println("false");
    }
}
