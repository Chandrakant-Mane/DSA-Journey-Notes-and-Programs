package Oops;

class Demo{

    // Exact Match  :  One - Argument 
    public void methodOne(int i){
        System.out.println("General Method");
    }
    // Var - Args : 0  to  n ;
    public void methodOne(int... i){
        System.out.println("Var-Arg Method");

    }
}

public class Test1_4 {
    public static void main(String[] args) {
        Demo d1 = new Demo() ;
        d1.methodOne();  // Var - Arg 
        d1.methodOne(10);  // ExactMatch
        d1.methodOne(10,20);  // Var - Arg Method 
    }
}
