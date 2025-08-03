package Strings;

public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Chandrakant Mane Is 20 Years Old";
        s.toLowerCase(); //  --> Nothing Will Happen
        System.out.println(s.toLowerCase());
        String c = s.toLowerCase(); 
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(c);

        System.out.println(s.toUpperCase());


        String a = "abc";
        String b = "xyz";
        a.concat(b); // Nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);

        String x = "" ; // Empty String 
        System.out.println(x.length());
        
        String l = "mane" ;
        String m = "mane" ;
        String n = new String("mane") ;
    
        System.out.println(l.hashCode());
        System.out.println(m.hashCode());
        System.out.println(n.hashCode());

    }
    
}
