package BitManipulation;

public class leetCodeQ231 {
        // Method - 1 ( Recursion ) .
    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 2 != 0)
            return false;
        return isPowerOfTwo(n / 2);
    }
        // Method - 2 ( Bit Manuplation )
        public static boolean isPowerOfTwoB(int n) {
            if (n <= 0)
                return false;
            return ((n & n - 1) == 0);
        }
    public static void main(String[] args) {
        int n = 16 ;
        System.out.println(isPowerOfTwo(n));

        System.out.println(isPowerOfTwoB(n));
    }
}
