package BitManipulation;

public class leetCodeQ2220 {
    public static  int minBitFlips(int start, int goal) {
        int xor = start ^ goal;

        int count = 0;
        while (xor != 0) {
            xor = (xor & (xor - 1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int start =  10 , goal = 7 ;

        System.out.println(minBitFlips(start, goal));
    }
}
