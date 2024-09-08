package Loops;

import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();

        int x = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println(" Composite Number");
                x = 1;
                sc.close();
                break;
            }
        }
        if (n == 1)
            System.out.println(" Neither Prime nor Composite");
        else if (x == 0)
            System.out.println(" Prime Number");
        

    }
}
