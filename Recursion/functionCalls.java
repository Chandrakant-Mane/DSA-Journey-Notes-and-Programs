package Recursion;

public class functionCalls {
    public static void mango(){
        System.out.println("Hii, I am in Mango");
    }

    public static void banana(){
        System.out.println("Hii, I am in Banana");
        mango() ;
    }

    public static void apple(){
        System.out.println("Hii, I am in Apple");
        banana() ;
    }

    public static void main(String[] args) {
        System.out.println("Hii, I am in Main");
        apple() ;
    }
}
