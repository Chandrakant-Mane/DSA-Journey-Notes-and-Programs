package Basic;
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a character : ");
        char ch = scan.next().charAt(0) ;
        System.out.println(ch);
        System.out.println((int)ch);

        System.out.print(" Enter a Number : ");
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println((char)a);
        scan.close();
    }
}

