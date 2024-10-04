package Oops;

interface ICalculator1{
    // public abstraction 
    void add(int a , int b) ;
    void sub(int a , int b) ;
}

interface IAdvanceCalculator1{
    // public abstraction 
    void mul(int a , int b) ;
    void div(int a , int b) ;
}

class CalculatorImpl1 implements ICalculator1, IAdvanceCalculator1{
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

public class OopsL6_2 { 
    public static void main(String[] args) {
        // Loose coupling : Polymorphism 
        ICalculator1 calculator = new CalculatorImpl1() ;
        calculator.add(10, 20);
        calculator.sub(100, 20);
        IAdvanceCalculator1 advcalculator = new CalculatorImpl1();
        advcalculator.mul(10 , 20) ;
        advcalculator.div(100 , 20 ) ; 

    }
    
}
