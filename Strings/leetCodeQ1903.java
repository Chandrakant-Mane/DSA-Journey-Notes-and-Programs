package Strings ;

public class leetCodeQ1903 {
    public static void main(String[] args) {
        String num = "354278264" ;
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) % 2 != 0) {
                System.out.println(num.substring(0, i + 1));
                break ;
            }
            i--;
        }
    }
}
