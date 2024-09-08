package Recursion;

import java.util.Scanner;

public class powerLinear {
    public static int pow(int a , int b){   // TC = O(b)
        if(b==0) return 1 ;
        return a * pow(a,b-1);
    }
    public static int pow2(int a , int b){   // TC = O(log b)
            if(b==0) return 1 ;
            int ans = pow2(a,b/2) ;
            if(b%2 == 0) return ans * ans ;
            else return ans * ans * a ;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter base : ");
        int a = sc.nextInt() ;
        System.out.print("Enter Power : ");
        int b = sc.nextInt() ;
        System.out.println(a + " reaised to the power " + b +" is " + pow2(a,b));
        sc.close(); 
    }
}
