package TwoDArrayList;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,4,7,11,15} , {2,5,8,12,19} , {3,6,9,16,22} , {10,1,14,17,24} , {18,21,23,26,30}};
        int target = 100 ;

        // Time Limit Exceeded 
        // No. Of Iterations / Rounds  = m*n
        int m = arr.length , n = arr[0].length;
        boolean flag = false ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == target) flag = true;

                
            }
        }
        if(flag == true) System.out.println(" True ");
        else
        System.out.println(" False ");
    }
    
}
