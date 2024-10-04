package Oops;

interface ICalculator3{
    // public abstraction 
    void add(int a , int b) ;
    void sub(int a , int b) ;
}

interface IAdvanceCalculator3 extends ICalculator3{
    // public abstraction 
    void mul(int a , int b) ;
    void div(int a , int b) ;
}


class CalculatorImpl3 implements IAdvanceCalculator3{
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
public class OopsL6_4 {
    public static void main(String[] args) {
        // loose coupling : Polymorphism
        IAdvanceCalculator3 calculator = new CalculatorImpl3() ;
        calculator.add(10, 20);
        calculator.sub(100, 20);
        calculator.mul(10, 20);
        calculator.div(100, 20);
    }
    
}
