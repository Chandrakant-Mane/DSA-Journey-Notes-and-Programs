package Oops;

class Parent{
    public void property(){
        System.out.println("Land + Cash + Gold");
    }
    public void marry(){
        System.out.println("RelativeGirl");
    }
}

class Child extends Parent{
    // Overriding 
    public void marry(){
        // Changing the implementation 
        System.out.println("SomeOther Girl...");
    }
}

public class OopsL4 {
    public static void main(String[] args) {
        // Parent Object 
        Parent p1 = new Parent() ;
        p1.property();
        p1.marry(); 

        System.out.println();

        // Child Object 
        Child c1 = new Child() ;
        c1.property(); 
        c1.marry(); 

        System.out.println();

        // Child Object 
        Parent p2 = new Child() ;
        p2.property(); 
        p2.marry(); 
        
    }
    
}
