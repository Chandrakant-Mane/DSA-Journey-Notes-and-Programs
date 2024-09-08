package TwoDimensionalArray;

public class addTwoMatrices {
    public static void main(String[] args) {
        
        int[][] arr = { {1,9,2} , {3,7,4} , {8,5,6} };
        int[][] brr = { {9,3,7} , {8,6,5} , {2,4,1} };
        int[][] res = new int[arr.length][arr[0].length];
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }
        
        for(int[] ele : res){
            for(int x : ele){
                System.out.print(x+ " ");
            }
            System.out.println();
        }

    }
    
}
