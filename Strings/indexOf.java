package Strings;

public class indexOf {
    public static void main(String[] args) {
        String s = "Chandrakant Mane";
        System.out.println(s.indexOf('k'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));


        // compareTo() is Used To Compare 2 Given String Lexographically

        String a = "abcgggg" ;
        String b = "abc" ;
        System.out.println(a.compareTo(b));

        //...................................................................

        String c = "Physics Wallah Skills" ;
        System.out.println(c.contains(" Wallah "));
        System.out.println(c.startsWith("Physics"));
        System.out.println(c.endsWith("lls"));

    }
    
}
