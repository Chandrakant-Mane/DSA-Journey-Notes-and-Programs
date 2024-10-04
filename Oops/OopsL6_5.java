package Oops;

interface IDemo{
    // public static final
    int x = 10 ;
}

public class OopsL6_5 implements IDemo{
    public static void main(String[] args) {
        int x = 100 ; // local variable 
        System.out.println(x);
        System.out.println(IDemo.x);
        System.out.println(OopsL6_5.x);
    }
    
}
