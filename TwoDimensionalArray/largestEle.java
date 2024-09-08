package TwoDimensionalArray;

import java.util.Scanner;

public class largestEle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        } 
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, arr[i][j]);
            }
        } 
        System.out.println("Largest Element Is : "+ mx);
        sc.close();

    }
    
}
