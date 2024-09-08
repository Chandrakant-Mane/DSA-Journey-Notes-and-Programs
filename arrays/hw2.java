package arrays;

public class hw2 {
    public static void main(String[] args) {

        // Method - 1
        // int[] arr = {-10,-20,-54,-41,-8,-5,-6,-45,-8,-56,-54,-94,-100};
        // int n = arr.length;
        // int min = Integer.MAX_VALUE;
        // for(int i=0; i<n; i++){
        //     // if(arr[i]<min) min = arr[i];
        //     min = Math.min(min, arr[i]);

        // }
        // System.out.println(min);


        //  Method - 2
        int[] arr = {10,20,54,41,-8,5,6,45,8,56,54,94,100};
        int n = arr.length;
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]<min) min = arr[i];

        }
        System.out.println(min);

    }
      
}
