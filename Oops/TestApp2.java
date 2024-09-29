package Oops;

class Employee1{
    // Instance variable 
    String name ;
    int age ;
    
    // Zero Argument constructor 
    Employee1(){
        System.out.println("Employee Constructor Called.... ");
    }

    // Instance Method 
    public void disp(){
        System.out.println("Name is : : " + name );
        System.out.println("Age  is : : " + age );

    }
}

public class TestApp2 {
    public static void main(String[] args) {
        //  Usage Of Zero Argument Constructor 
        Employee1 e1 = new Employee1();
        e1.disp();
    }
}
