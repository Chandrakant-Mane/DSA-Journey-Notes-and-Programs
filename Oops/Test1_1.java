package Oops;

class Sample1{
    public void methodone(String s){
        System.out.println("String version....");
    }
    public void methodone(StringBuffer o ){
        System.out.println("StringBuffer version....");
    }
    public void methodone(Object o){
        System.out.println("Object version....");
    }
}

public class Test1_1 {
    public static void main(String[] args) {
        Sample1 s = new Sample1() ;
        s.methodone(new String("Sachin")) ;  // String 
        s.methodone(new StringBuffer("Sachin"));  // StringBuffer 

        // Compile Time Error .
        // s.methodone(null); // String(reference) , StringBuffer(reference)
    }
    
}
