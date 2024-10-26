package Stacks;

import java.util.Arrays;

public class stockSpan {

    public static void calculateSpan(int[] price , int n , int[] s){
        s[0] = 1 ;
        for (int i = 1; i < n; i++) {
            s[i] = 1 ;
            for (int j = i - 1; j >= 0 && price[i] >= price[j]; j--) {
                s[i]++ ;
            }
        }
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] price = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int[] s = new int[n] ;

        calculateSpan(price , n , s);

        printArray(s);
    }
}
