package BitManipulation;

public class leetCodeQ1486 {
    // Method 1 : Not best T.C = O( n )
    public static int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }
    // Best Method T.C = O(1) .
    // Need to do . Not do yet .
    public static void main(String[] args) {
        int n = 5 ;
        int start = 0 ;
        System.out.println(xorOperation(n, start));
    }
}
