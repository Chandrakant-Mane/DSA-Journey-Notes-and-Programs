package arrays;

public class initialiseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, -9, -10, 4, 58, 68, 79, 49};
        int n = arr.length;
        System.out.println(n);
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
