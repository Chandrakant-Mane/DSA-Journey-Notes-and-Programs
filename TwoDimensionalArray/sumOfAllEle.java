package TwoDimensionalArray;

public class sumOfAllEle {
    public static void main(String[] args) {

        int[][] arr = {{4,6,5,4}, {10,30,43,54}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j] ;
            }
        }
        System.out.println(" sum is : " +sum );

    }
    
}
