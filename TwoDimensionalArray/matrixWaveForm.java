package TwoDimensionalArray;

public class matrixWaveForm {
    public static void main(String[] args) {
        // int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9}};
        // int[][] arr = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} };
        
        // int m = arr.length , n = arr[0].length;

        // // Wave Print -> Row Wise (alternate)

        // for (int i = 0; i < m; i++) {
        //     if(i%2 = 0){
        //     // if(i%2 > 0){

        //         for (int j = 0; j < n; j++) {
        //             System.out.print(arr[i][j] + " ");
        //     }
        //         // System.out.println();
        //     }
        //     else{
        //         for (int j = n-1; j >= 0; j--) {
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         // System.out.println();
        //     } 
        // }

        // Wave Print  - > Col Wise  (alternate)
        
        int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };
        
        int m = arr.length , n = arr[0].length;

        // Wave Print -> Row Wise (alternate)

        for (int i = 0; i < n; i++) {          // cols 
            // if(i%2 == 0){
            if(i%2 > 0){
                for (int j = m-1; j >= 0; j--) {      // rows 
                    System.out.print(arr[j][i]);
            }
            }
            else{
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][i]);
                }
            } 
        }
    }
    
}
