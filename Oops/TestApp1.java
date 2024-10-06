package Oops;

public class TestApp1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("sachin" , "mumbai" , 18 , 92 , "A" ) ;
    
        s1.disp();
    }
}
    // Base Class Or Super Class Or Parent Class
class Person9{
    public String name ;
    public String address ;
    public int age ;
}
    // Derived Class Or Sub Class Or Child Class 
class Student2 extends Person9{
    // Instance Variables 
    // String name ;
    // String address ;
    // int age ;
    public int marks ;
    public String grade ;
    // Constructor 
    Student2(String name , String address , int age , int marks , String grade ){
        System.out.println("Calling during Object Creation..... ");
        this.name = name ;
        this.address = address ;
        this.age = age ;
        this.marks = marks ;
        this.grade = grade ;
    }
    // Normal Method 
    public void disp(){
        System.out.println("Name    is  : " + name ); 
        System.out.println("Address is  : " + address);
        System.out.println("Age     is  : " + age );
        System.out.println("Marks   is  : " + marks);
        System.out.println("Grade   is  : " + grade);

    }
}