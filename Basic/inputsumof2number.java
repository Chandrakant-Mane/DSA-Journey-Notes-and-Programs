package Basic;
import java.util.Scanner;
public class inputsumof2number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double n1 = scan.nextDouble();
        System.out.print("Enter Second Number : ");
        double n2 = scan.nextDouble();
        System.out.println("Sum of Two Number is : " + (n1 + n2));
        scan.close();

    }

}
