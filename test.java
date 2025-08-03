import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class test {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in) ;
    //     int n = sc.nextInt() ;

    //     for(int i = 1 ; i <= n ; i++){
    //         for(int j = 1 ; j <= n ; j++){
    //             if(i == j){
    //                 System.out.print((char)(i+64) + " ");
    //             }
    //             else if( i+j == n+1){
    //                 System.out.print((char)(i+64) + " ");
    //             }
    //             else 
    //                 System.out.print("  "); ;
        
    //         }
    //         System.out.println();
    //     }

    //     System.out.println();

    //     for(int i = 1 ; i <= n ; i++){
    //         for(int j = n ; j >= i ; j--){
    //             System.out.print("  ");
    //         }

    //         for(int k = 1 ; k <= i ; k++){
    //             System.out.print("* ");
    //         }

    //         for(int l = 1 ; l <= i-1 ; l++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }



    //     sc.close(); 
    // }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 5, 6, 7}; 
        System.out.println(findUnion(a, b)); 
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int set1 : set) {
            arr.add(set1);
        }
        return arr;
    }
}

// class Solution {
//     // Function to return a list containing the union of the two arrays.
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//         // add your code here
//         TreeSet<Integer> set = new TreeSet<>();
//         for (int i = 0; i < a.length; i++) {
//             set.add(a[i]);
//         }
//         for (int i = 0; i < b.length; i++) {
//             set.add(b[i]);
//         }
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int set1 : set) {
//             arr.add(set1);
//         }
//         return arr;
//     }
// }
