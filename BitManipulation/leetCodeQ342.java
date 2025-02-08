package BitManipulation;

public class leetCodeQ342 {
        // Method 1 : 
    public static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }
        // Method 2 : Best 
    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return (root * root == n);
    }

    public static boolean isPowerOfFour1(int n) {
        if (n <= 0)
            return false;
        return ((n & (n - 1)) == 0) && isPerfectSquare(n);
    }
        // Method 3 : Best
    public static boolean isPowerOfFour2(int n) {
        if (n <= 0)
            return false;
        return ((n & (n - 1)) == 0) && (n % 3 == 1);
    }
    public static void main(String[] args) {
        int n = 16 ;

        System.out.println(isPowerOfFour(n));
        System.out.println(isPowerOfFour1(n));
        System.out.println(isPowerOfFour2(n));
    }
}
