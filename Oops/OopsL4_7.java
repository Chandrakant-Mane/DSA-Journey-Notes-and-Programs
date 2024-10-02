package Oops;

abstract class Parent6{
    public abstract void methodOne() ;
}

class Child6 extends Parent6{
    public void methodOne(){
        System.out.println("ChildClass : : methodOne()");
    }
}

public class OopsL4_7 {

    public static void main(String[] args) {
        Parent6 p = new Child6() ;
        p.methodOne(); 
    }
    
}
