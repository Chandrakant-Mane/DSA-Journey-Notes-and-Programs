package Oops;

class Parent4{
    public Object methodOne(){
        return null ;
    }
}

    // Example 1 :  // CE : Void And Object Are Not Related 
// class Child4 extends Parent4{
//     public void methodOne(){
//         System.out.println("Hello From Child....");
//     }
// }

    // Example 2 :
class Child4 extends Parent4{
    public String methodOne(){
        System.out.println("Hello From Child....");
        return null ;
    }
}
public class OopsL4_3 {
    public static void main(String[] args) {
        Parent4 p = new Child4() ;
        p.methodOne() ;
    }
    
}

