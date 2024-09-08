package arrays;

public class PassingArraysToMethod {
     public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
     }

     // In Arrays Pass by Reference .
     // In Integers  Pass by Values .

    public static void change(int[] x) {
        x[2] = 100;
    }
    
}

