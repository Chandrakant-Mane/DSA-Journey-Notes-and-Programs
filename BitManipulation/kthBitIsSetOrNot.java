package BitManipulation;

public class kthBitIsSetOrNot {
    public static void main(String[] args) {
        int a = 1475 ;
        int k = 3 ;
        int mask = 1 << k ;

        if((a & mask) == 0) 
            System.out.println(" Not Set / Bit was off (False)");
        if((a & mask )!= 0) 
            System.out.println("Set (True)");
        // System.out.println((1483 & (1<<3)) != 0);
    }
}
