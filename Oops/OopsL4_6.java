package Oops;

class Parent7{
    // Final methods can't be overriden in Child class ;
    public final void methodOne(){
        System.out.println("ParentClass : : methodOne()");
    }
}
class Child7 extends Parent7{
    // methodOne() in Child connot override methodOne() in Parent 
    // public void methodOne(){
    //     System.out.println("ChildClass : : methodOne()");
    // }
}

public class OopsL4_6 {
    public static void main(String[] args) {
        Parent7 p = new Child7() ;
        p.methodOne();
    }
}
