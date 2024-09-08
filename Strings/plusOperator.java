package Strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s = s.concat("xyz");
        s = s+"def";
        System.out.println(s);
        s = s + t ;
        System.out.println(s);
        s += 10 ;
        System.out.println(s);
        s = s + 'z' ;
        System.out.println(s);
        System.out.println("Hi i am " + 10);

        String x = "abc";
        x += t ;  // abcpqr
        x = 10 + x ;
        System.out.println(x);

        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");

    }
}
