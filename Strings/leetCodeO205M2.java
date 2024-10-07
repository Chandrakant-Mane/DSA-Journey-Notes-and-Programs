package Strings;

public class leetCodeO205M2 {
    public static void main(String[] args) {
        
        // With Out using another arr
        String s = "egg";
        String t = "add";
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
        for (int i = 0; i < 128; i++) {
            a[i] = '\0' ;
            
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch ;
            if(a[idx] == '\0')  a[idx] = dh;
            else{
                if(a[idx] != dh){
                    System.out.println("False");
                    break;
                }
            }
        }

        System.out.println(a);
    }
}
