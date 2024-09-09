package Recursion;

import java.util.Scanner;

public class mazePath {
                    // M - 1
    public static int maze(int row , int col ,int m , int n ){
        if(col == n || row == m ) return 1;
        // if(row == m && col == n ) return 1 ;
        // if(row>m || col>n) return 0 ;
        int rightWays = maze(row , col+1 , m , n);
        int downWays = maze(row+1 , col , m , n) ;
        return rightWays + downWays  ;
    }

                    // M - 2 
    public static int maze2(int row , int col){
        if(col == 1 || row == 1 ) return 1;
        int rightWays = maze2(row , col-1);
        int downWays = maze2(row-1 , col) ;
        return rightWays + downWays  ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt() ;
        System.out.print("Enter m : ");
        int m = sc.nextInt() ;
        // System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m , n ));
        sc.close(); 
    }
}
