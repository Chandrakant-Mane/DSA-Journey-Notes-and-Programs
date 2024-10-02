package Oops;

class Calculator2_1{

    public void add(int a){
        System.out.println("int - int argument ");
    }
    public void add(float a ){
        System.out.println("float - float  argument ");
    }
    
    
}

public class TestApp6_1 {
    public static void main(String[] args) {
        Calculator2_1 c1 = new Calculator2_1() ;
        c1.add('a') ; // char  ----->  char , int 
        c1.add(19L) ; // long  ----->  long , float , double 

        // Compile Time Error : No Suitable Method found 
        // c1.add(10.5) ;// double  ----> double 
    }
}
