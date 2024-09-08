package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abc");
        System.out.println(s);
        s.append("xyz");
        s.append(35);
        s.append('*');
        char[] ch = {'r','a','g'};
        s.append(ch);
        // int[] arr = {1,3,4,5,5};
        // s.append(arr); // Does Not Work , Address Is Appended
        StringBuilder t = new StringBuilder("pqr");
        s.append(t);
        // s += "fqwf" ; // Not Possible
        System.out.println(s);
    
    }
}
