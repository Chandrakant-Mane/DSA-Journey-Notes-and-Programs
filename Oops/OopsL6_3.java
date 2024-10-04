package Oops;

interface ICalculator2{
    // public abstraction 
    void add(int a , int b) ;
    void sub(int a , int b) ;
}

interface IAdvanceCalculator2{
    // public abstraction 
    void mul(int a , int b) ;
    void div(int a , int b) ;
}

class CalculatorAdvanced{
    public void mul(int a , int b){
        System.out.println("The mul is : : " + (a*b));
    }
    public void div(int a , int b){
        System.out.println("The div is : : " + (a/b));
    }
}

class CalculatorImpl2  extends CalculatorAdvanced implements ICalculator2{
    public void add(int a , int b){
        System.out.println("The sum is : : " + (a+b));
    }
    public void sub(int a , int b){
        System.out.println("The diff is : : " + (a-b));
    }
    
}

public class OopsL6_3 {
    public static void main(String[] args) {
        // loose coupling : Polymorphism
        CalculatorImpl2 calculator = new CalculatorImpl2() ;
        calculator.add(10, 20);
        calculator.sub(100, 20);
        calculator.mul(10, 20);
        calculator.div(100, 20);
    }
    
}
