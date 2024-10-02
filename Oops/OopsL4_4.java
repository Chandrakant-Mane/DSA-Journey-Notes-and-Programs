package Oops;

class Parent5{
    public void methodOne(){
        System.out.println("Hello From Parent Class...");
    }
}

class Child5 extends Parent5{
    //  CE :  Can't Reduce The Scope Of Access Modifier .
    // protected void methodOne(){
    //     System.out.println("Hello From Child Class...");
    // }
}

public class OopsL4_4 {
    public static void main(String[] args) {
        Parent5 p = new Child5() ;
        p.methodOne();
    }
    
}
