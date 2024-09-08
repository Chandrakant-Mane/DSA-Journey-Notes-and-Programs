package arrays;

public class maxinarray {
    public static void main(String[] args) {

        // Method - 1
        // int[] arr = {10,20,54,41,8,5,6,45,8,56,54,94,100};
        // int n = arr.length;
        // int mx = arr[0];
        // for(int i=1; i<n; i++){
        //     if(arr[i]>mx) mx = arr[i];

        // }
        // System.out.println(mx);/


        // Method - 2
        int[] arr = {-10,-20,-54,-41,-8,-5,-6,-45,-8,-56,-54,-94,-100};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx, arr[i]);

        }
        System.out.println(mx);


    }
}
