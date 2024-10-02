package Oops;

class Parent5_2{

    // CE : Error  :  methodOne() has Private Access in Parent.
    // private void methodOne(){
    //     System.out.println("Hello From Parent Class...");
    // }
}

class Child5_2 extends Parent5_2{

    // CE : Error  :  methodOne() has Private Access in Parent.
    // private  void methodOne(){
    //     System.out.println("Hello From Child Class...");
    // }
}


public class OopsL4_5 {
    public static void main(String[] args) {
        // Parent5_2 p = new Child5_2() ;
        // p.methodOne() ;
    }
}
