package BitManipulation ;

public class leetCodeQ191 {
    public static int hammingWeight(int n) {
        // Method 1 : 
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((n & mask) != 0)
                count++;
        }
        return count;
    }
        // Method 1 : Best
    public static int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11 ;
        System.out.println(hammingWeight(n));
        System.out.println(hammingWeight2(n));
    }
}
