package Basic;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double x = scan.nextDouble();
        int y = (int) x;
        System.out.println(y / 2);
        System.out.print("Enter Second Number : ");
        int a = scan.nextInt();
        double b = (double) a;
        System.out.println(b);
        scan.close();
    }
}


