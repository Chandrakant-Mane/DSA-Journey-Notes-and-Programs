package Recursion;

public class functioncalls2 {
    public static void mango(){
        System.out.println("Hii, I am in Mango");
    }

    public static void banana(){
        mango() ;
        System.out.println("Hii, I am in Banana");
    }

    public static void apple(){
        banana() ;
        System.out.println("Hii, I am in Apple");
        mango();
    }

    public static void main(String[] args) {
        System.out.println("Hii, I am in Main");
        apple() ;
    }
}
