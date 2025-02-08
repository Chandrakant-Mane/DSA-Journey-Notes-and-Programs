package BitManipulation;

public class xorOfGivenRange {
    public static int xor(int n){
        if(n%4 == 0)
            return n ;
        else if(n%4 == 1) 
            return 1 ;
        else if(n%4 == 2) 
            return n+1 ;
        else 
            return 0 ;
    }
    public static int xor(int a , int b){
        return xor(a-1)^xor(b) ;
    }
    public static void main(String[] args) {
        int a = 3 ;
        int b = 9 ;

        System.out.println(xor(a , b));
    }
}
