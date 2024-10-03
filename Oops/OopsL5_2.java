package Oops;

abstract class Person5 {
    String name ;
    int age ;
    float height;

    Person5(String name , int age , float height){
        this.name = name ;
        this.age = age ;
        this.height = height ;
    }
    
}

class Student5 extends Person5{
    int marks ;
    float avg ;

    Student5(String name , int age , float height , int marks , float avg){
        // To call parameterised constructor of parent from child class
        super(name, age, height) ;  // super is a method call which is used to call parameterised constructor of parent from child class
        this.marks = marks ;
        this.avg = avg ;
    }

    public void display(){
        System.out.println("Name       is  : " + name );
        System.out.println("Age        is  : " + age);
        System.out.println("Height     is  : " + height);
        System.out.println("Marks      is  : " + marks);
        System.out.println("Avg        is  : " + avg);
    }
}

public class OopsL5_2 {
    public static void main(String[] args) {
        Student5 student = new Student5("Sachin", 51, 5.3f, 100, 53.5f) ;
        student.display(); 
    }
    
}
