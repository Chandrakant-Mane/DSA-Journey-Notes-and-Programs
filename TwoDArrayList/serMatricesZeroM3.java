package TwoDArrayList;

public class serMatricesZeroM3 {
    public static void main(String[] args) {
        int[][] arr = { { 0,1,2,0 }, { 3,4,5,2}, { 1,3,1,5}};
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false ;
        boolean zeroCol = false ;
        
        // Check The 0th Row 
        for(int j=0 ; j<n ; j++){
            if(arr[0][j]==0){
                zeroRow = true ;
                break;
            }
        }
        // Check The 0th Col 
        for(int i=0 ; i<m ; i++){
            if(arr[i][0]==0){
                zeroCol = true ;
                break;
            }
        }
        //..........................................................................
        // Traverse In The Submatrix Without 0th Row & 0th Col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j] == 0){
                    arr[i][0] = 0 ;
                     arr[0][j] = 0 ;
                }
            }  
        }

        // Traverse In The 0th Row 
        for(int j = 1 ; j < n ; j++){
            if(arr[0][j] == 0){ // Set jth Col To 0
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0 ;
                }

            }
        }

        // Traverse In The 0th Col
        for (int i = 1; i < m; i++) {
            if(arr[i][0] == 0){ // Set ith Row To 0
                for(int j = 1; j < n ; j++){
                    arr[i][j] = 0 ;
                }
            }
            
        }
        //..................................................................
        if(zeroRow==true){  // Set the 0th Row To 0 
            for(int j=0 ; j<n ; j++){
                arr[0][j] = 0 ;
            }
        }
        if(zeroCol==true){  // Set the 0th Col To 0 
            for(int i=0 ; i<m ; i++){
                arr[i][0] = 0 ;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
