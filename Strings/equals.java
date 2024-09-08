package Strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz" ; 
        String a = "abcxyz" ;
        String b = new String(s);
        String c = "abc" ; 
        c = c + "xyz" ;
        System.out.println(a);
        System.out.println(s==b);
        System.out.println(s.equals(b));
        System.out.println(s.compareTo(c ));
    }
    
}
