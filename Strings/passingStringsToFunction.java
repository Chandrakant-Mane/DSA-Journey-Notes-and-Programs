package Strings;

public class passingStringsToFunction {
    public static void main(String[] args) {
        String s = "raghav";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s = "madhav";
    }
}
