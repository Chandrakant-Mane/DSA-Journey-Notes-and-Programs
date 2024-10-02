package Oops;

class Parent5_1{
    void methodOne(){
        System.out.println("Hello From Parent Class...");
    }
}

class Child5_1 extends Parent5_1{
    //  default /protected/public 
    protected void methodOne(){
        System.out.println("Hello From Child Class...");
    }
}

public class OopsL4_4_1 {
    public static void main(String[] args) {
        Parent5_1 p = new Child5_1() ;
        p.methodOne();
    }
}
