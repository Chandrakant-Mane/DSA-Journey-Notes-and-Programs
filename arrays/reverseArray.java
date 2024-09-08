package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80}; 
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        //  reverse
        int n = arr.length;

        // for(int i = 0 ; i < n/2 ; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp ;
        // }


        // Using two pointers 
        int i = 0 , j = n - 1 ;
        // int i = 1 , j = 5;  Part of array reverse .
        while(i<=j){
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

    }

}

    

