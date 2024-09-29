package Oops;
    //  Local Variables
class Calculator{
    public void add(int a , int b){
        int result = a + b ;
        System.out.println("The Sum is : : " + result);
    }
}

public class TestApp3 {
    public static void main(String[] args) {
        Calculator c = new Calculator() ;
        c.add(10,20) ;
    }
    
}
