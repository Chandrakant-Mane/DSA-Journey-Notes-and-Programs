package TwoDArrayList;

public class search2DMatrixM2 {
    public static void main(String[] args) {
        int[][] arr = { {1,4,7,11,15} , {2,5,8,12,19} , {3,6,9,16,22} , {10,1,14,17,24} , {18,21,23,26,30}};
        int target = 1 ;
        int m = arr.length , n = arr[0].length;
        int i = 0 , j = n-1 ;
        boolean flag = false ;

        while( i < m && j >= 0){
            if(arr[i][j] < target) i++; // GO DOWN
            else if(arr[i][j] > target) j--;  // GO Left 
            else if(arr[i][j] == target) {
                flag = true ;
                break;
            }
        }
        if(flag == true) System.out.println( "Element Found ");
        else 
        System.out.println(" Element Not Found ");


        // Home Work is to start with i at m  and j at 0 .
    }
    
}
