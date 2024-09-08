package arrays;

import java.util.ArrayList;
import java.util.List;


public class basicOfArrayList {
    public static void main(String[] args) {
        // int[] arr = new int[6];
        // double[] brr = {3.12, 4.3, 3.3, 5.67};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,10); // arr[0] = 10
        arr.add(1,20); // Initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.get(0)); // arr[0]
        // for(int i = 0; i < arr.size(); i++){
        //     System.out.print(arr.get(i)+ " "); // arr[i]
        // }
        System.out.println(arr);   // ( ye b work karta hai)

    
        arr.set(2, 300);  // Modify
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        System.out.println(arr);


        arr.add(90);                   // Push back
        System.out.println(arr.size());
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        System.out.println(arr);
        List<Integer> brr = new ArrayList<>();

        System.out.println(brr);

        // int[] brr = {4,6,7,4,3,5};
        // System.out.println(brr);
    //     for(int ele:arr){
    //     System.out.print(ele+ " "); 
    // }


    }
    
    
}
