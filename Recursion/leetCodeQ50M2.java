package Recursion;

public class leetCodeQ50M2 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;
        double ans = 1.0;
        long y = n;
        if (n < 0) {
            y = y * -1;
        }
        while (y > 0) {
            if (y % 2 == 1) {
                ans = ans * x;
                y = y - 1;
            } else {
                x = x * x;
                y = y / 2;
            }
        }
        if (n < 0) {
            ans = (double) (1.0) / (double) (ans);
        }
        System.out.println(ans);
    }
}
