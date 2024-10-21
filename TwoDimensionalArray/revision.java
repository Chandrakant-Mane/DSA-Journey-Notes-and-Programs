package TwoDimensionalArray ;

import java.util.Scanner;

public class revision {
    public static void main(String[] args) {
        int[][] grid = {{2343,353,24,2342} , {242,3223,32,42,} , {242,2432,24,234} , {24,2422,243,242}};
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3,4} , {1,2,3,4} , {1,2,3,4} , {1,2,3,4}};
        int m = grid.length ;
        int n = grid[0].length ;
        // System.out.println(m + " " + n );
        //     Input 
        // for(int i = 0 ; i < m  ; i++){
        //     for (int j = 0; j < n; j++) {
        //         grid[i][j] = sc.nextInt() ;
        //     }
        // }

        // for(int[] ele : grid){
        //     for(int x : ele){
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }


        System.out.println();
        //     OutPut  
        // int[][] res = new int[m][n];
        int mx = Integer.MIN_VALUE ;
        int sum = 0 ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < m ; i++){
            for (int j = 0; j < n; j++) {
                mx = Math.max(grid[i][j] , mx);
                sum += grid[i][j];
                min = Math.min(min , grid[i][j]);
                grid[i][j] += arr[i][j] ;
            }
            // System.out.println();
        }
        System.out.println("Sum Of Two Matrix : ");
        for(int[] ele : grid){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("larges ele is : " + mx);
        System.out.println("Smallest ele is : " + min);
        System.out.println("Sum of all eles is : " + sum);
        sc.close();
    }
}
