package arrays;
import java.util.Arrays;
public class buildInMethods {
    public static void main(String[] args) {
        int[] arr = {60, 50, 20, 30, 40, 10};
        // for each loop
        for(int ele : arr){
            System.out.print(ele+ "  ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println(); 

        // for each loop 
        for(int ele : arr){
            System.out.print(ele+ "  ");
        }

    }
    
}
