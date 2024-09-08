package arrays;

public class leetCodeQ1 {
    public static void main(String[] args) {

        // Find the doublet in the Array whose sum is equal to the given value x. (Two
        // Sum) ?

        int[] arr = { 2, 5, 3, 6, 8 };
        int x = 14;
        // System.out.println(arr.length);
        boolean flag = false  ;
        for (int i = 0; i < arr.length; i++) {
            flag = false; // Optimization
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                    flag = true; // Optimization
                    break; // Optimization
                }
            }
            if (flag == true)
                break; // Optimization
        }
        if(flag == false) System.out.println("Not Possible");
    }

}
