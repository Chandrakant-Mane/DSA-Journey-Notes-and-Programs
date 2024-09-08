package TwoDArrayList;

public class setMatricesZeroM2 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1,3,1,5} };
        int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Marking The Particular Row And Col 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0 ) {
                    row[i] = true;
                    col[j] = true;
                }  
            }  
        }
        // Ser the " True " Rows to 0
        for (int k = 0; k < m; k++) {
            if(row[k] == true){
                for (int i = 0; i < n; i++) {
                    arr[k][i] = 0 ;
                    // arr[k][i] = 0 ;  
                }     
            }
        }
        // Ser the " True " Cols to 0
        for (int k = 0; k < n; k++) {
            if(col[k] == true){
                for (int i = 0; i < m; i++) {
                    arr[i][k] = 0 ;
                }
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
