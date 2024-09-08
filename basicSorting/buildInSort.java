package basicSorting;

import java.util.Arrays;

public class buildInSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,2,6,} ;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        Arrays.sort(arr) ;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println(); 

    }
}
