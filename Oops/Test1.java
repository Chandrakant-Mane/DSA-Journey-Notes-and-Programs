package Oops;

class Sample{
    public void methodone(String s){
        System.out.println("String Version ...");
    }
    public void methodone(Object o){
        System.out.println("Object Version ...");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Sample s = new Sample() ;
        s.methodone("sachin") ;  // String    ---> String
        s.methodone(new Object()) ;  // Object ---> Object 
        s.methodone(null) ;  // null ----->  String(reference) , object(reference)
    }
}
