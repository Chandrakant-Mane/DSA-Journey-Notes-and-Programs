package arrays;

public class sumOfArray {
    public static void main(String[] args) {
        // int[] arr = { 23, 45, 64, 74, 43, 64, 23, 54, 23, 234 };
        int[] arr = { 10, 20, 30, 40, 50, 60, -9, -10, 4, 58, 68, 79, 49};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);
    }

}
