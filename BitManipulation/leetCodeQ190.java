package BitManipulation;

public class leetCodeQ190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int i = 0, j = 31;
        while (i < j) {
            int iMask = (1 << i), jMask = (1 << j);
            boolean iOn = ((n & iMask) != 0);
            boolean jOn = ((n & jMask) != 0);
            if (iOn != jOn) {
                n ^= iMask; // ith bit is now flipped
                n ^= jMask; // jth bit is now flipped
            }
            i++;
            j--;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 43261596 ;
        System.out.println(reverseBits(n));
    }
}
