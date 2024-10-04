package Oops;

interface ICalculator{
    // public abstraction 
    void add(int a , int b) ;
    void sub(int a , int b) ;
    void mul(int a , int b) ;
    void div(int a , int b) ;
}

class CalculatorImpl implements ICalculator{
    public void add(int a , int b){
        System.out.println("The sum is : : " + (a+b));
    }
    public void sub(int a , int b){
        System.out.println("The diff is : : " + (a-b));
    }
    public void mul(int a , int b){
        System.out.println("The mul is : : " + (a*b));
    }
    public void div(int a , int b){
        System.out.println("The div is : : " + (a/b));
    }
}

public class OopsL6_1 {
    public static void main(String[] args) {
        // Loose coupling : Polymorphism 
        ICalculator calculator = new CalculatorImpl() ;
        calculator.add(10, 20);
        calculator.sub(100, 20);
        calculator.mul(10 , 20) ;
        calculator.div(100 , 20 ) ; 

    }
    
}
