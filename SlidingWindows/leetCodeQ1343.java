package SlidingWindows;

public class leetCodeQ1343 {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 } ;
        int k = 3 ; 
        int threshold = 5 ;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int i = 1, j = k;
        int count = 0;
        if (sum / k >= threshold)
            count++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j];
            if (sum / k >= threshold)
                count++;
            i++;
            j++;
        }
        System.out.println(count );
    }
}
