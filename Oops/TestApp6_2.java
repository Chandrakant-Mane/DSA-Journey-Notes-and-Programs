package Oops;

class Calculator3{

    public void add(int a , float b){
        System.out.println("int - int argument ");
    }
    public void add(float a , int b ){
        System.out.println("float - float  argument ");
    }

}

public class TestApp6_2 {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3() ;
        c1.add(10,20.5f) ;  // int , float  
        c1.add(20.5f , 10) ; // float , int 
        // Ambigous Method Call Compile Time Error .
        // c1.add(10 , 20) ;
    }
}
