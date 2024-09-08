package arrays;

public class hw1 {
    public static void main(String[] args) {
        int[] arr = {23, 34, 54, 584, 34};
        int n = 1 ;
        for(int i = 0 ; i < arr.length ; i++ ){
            n *= arr[i];

        }
        System.out.println(n);
    }
    
}
