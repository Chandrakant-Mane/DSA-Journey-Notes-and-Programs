package Recursion;

public class leetCodeQ50 {
    public static void main(String[] args) {
        double x = 2.00000 ;
        int n = -2 ;
        double ans = 1.0;
        long y = n;
        if (n < 0) {
            y = n * -1;
        }
        for (int i = 0; i < y; i++) {
            ans = ans * x;
        }
        if (n < 0) {
            ans = 1 / ans;
        }

        System.out.println(ans);
    }
}
