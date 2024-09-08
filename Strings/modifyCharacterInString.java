package Strings;

public class modifyCharacterInString {
    public static void main(String[] args) {
        String s = "hello";
        // heylo
        // 2nd Index change to y 
        s = s.substring(0,2) + 'y' + s.substring(3) ;

        System.out.println(s);
    }
}
