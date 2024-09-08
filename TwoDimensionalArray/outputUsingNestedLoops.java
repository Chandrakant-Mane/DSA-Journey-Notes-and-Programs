package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        // arr[0][0] = 9 ;

        int m = arr.length;  // No. of Rows / Lines 
        int n = arr[0].length; // No. of Cols 
        System.out.println(m);
        System.out.println(n);

        // Input of 2D Array 
        for(int i = 0 ; i < m ; i++){        // Rows 
            for(int j = 0 ; j < n ; j++){    // Cols
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Output of 2D Array 
        for(int i = 0 ; i < m ; i++){        // Rows 
            for(int j = 0 ; j < n ; j++){    // Cols
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
