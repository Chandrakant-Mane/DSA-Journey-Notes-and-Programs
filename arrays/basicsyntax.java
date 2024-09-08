package arrays;

public class basicsyntax {
    public static void main(String[] args) {

        int[] arr ; // declaration
        arr = new int[5]; // memory allocation
        // initialising individual elments
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;
        // output of array elments
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");

        // update
        arr[0] = 99;
        arr[0] += 10;
        System.out.println(arr[0]);

    }
    
}
