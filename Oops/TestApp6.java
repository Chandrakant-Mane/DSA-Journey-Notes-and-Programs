package Oops;

class Calculator2{

    public void add(int a , int b){
        System.out.println("int - int argument ");
    }
    public void add(float a , float b ){
        System.out.println("float - float  argument ");
    }
    public void add(double a , double b){
        System.out.println("double - double argument");
    }

}

public class TestApp6 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2() ;
        c1.add(10,20) ;
        c1.add(10.5f,20.5f) ;
        c1.add(10.5 , 10.5) ;
    }
    
}
