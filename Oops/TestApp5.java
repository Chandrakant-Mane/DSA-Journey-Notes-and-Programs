package Oops;

class Student3{

    // Instance Variable 
    String name ;
    int age ;

    // Constructor 
    Student3(String name , int age){
        this.name = name ;
        this.age = age ;
    }

    // Instance Method 
    public void disp(){
        System.out.println("Name is : : " + name );
        System.out.println("Age is  : : " + age );
        System.out.println();
    }
}

public class TestApp5 {
    public static void main(String[] args) {
        Student3 std1 = new Student3("Sachin", 51) ;
        std1.disp(); 

        Student3 std2 = new Student3("Kohli", 33) ;
        std2.disp() ;
    }
    
}
