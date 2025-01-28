package Greedy;

public class leetCodeQ860 {
    public static boolean lemonadeChange(int[] arr) {
        int five = 0;
        int ten = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 5)
                five += 1;
            else if (arr[i] == 10) {
                ten += 1;
                if (five == 0)
                    return false;
                else
                    five -= 1;
            } else {
                if (ten >= 1 && five >= 1) {
                    ten -= 1;
                    five -= 1;
                } else if (five >= 3) {
                    five -= 3;
                } else
                    return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 10, 20 } ;
        int[] arr1 = { 5, 5, 10, 10, 20 } ;
        System.out.println(lemonadeChange(arr));
        System.out.println(lemonadeChange(arr1));
    }
}
