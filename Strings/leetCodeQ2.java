package Strings;

public class leetCodeQ2 {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        char[] a = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch ;
            if(a[idx] == '\0')  a[idx] = dh;
            else{
                if(a[idx] != dh){
                    System.out.println("False");
                    break;
                }
            }
        }
        char[] b = new char[128];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch ;
            if(b[idx] == '\0')  b[idx] = dh;
            else{
                if(b[idx] != dh){
                    System.out.println("False");
                    break;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
    
}
