package Oops;

class Sample2{
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
        Sample2 s = new Sample2() ;
        s.methodone(new String("Sachin")) ;  // String 
        s.methodone(new StringBuffer("Sachin"));  // StringBuffer 

        // Compile Time Error .
        // s.methodone(null); // String(reference) , StringBuffer(reference)
    }
    
}
