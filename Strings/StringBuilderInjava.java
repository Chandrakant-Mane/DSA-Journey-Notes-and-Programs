package Strings;

public class StringBuilderInjava {
    public static void main(String[] args) {
        String s = new String("Raghav");
        StringBuilder sb = new StringBuilder(s);

        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder(10);
    
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(x.length());
        System.out.println(y.length());

        System.out.println(y.capacity());

        StringBuilder a = new StringBuilder();
        System.out.println(a.capacity());
    }
}
