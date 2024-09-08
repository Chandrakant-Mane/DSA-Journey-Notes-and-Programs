package basicSorting;

public class bubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1} ;
        int n = arr.length ;
        print(arr);
        // Bubble Sort  2 
        // for(int x = 0 ; x < n-1 ; x++ ){        // n - 1 Passes
        //     for (int i = 0; i < n-1-x; i++) {
        //         if(arr[i] > arr[i+1]){
        //             int temp = arr[i] ;
        //             arr[i] = arr[i+1] ;
        //             arr[i+1] = temp ; 
        //         }
                
        //     }
        // }

        // Bubble Sort Optimised . 
        for(int x = 0 ; x < n-1 ; x++ ){        // n - 1 Passes
            boolean flag = true ;
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i+1] ;
                    arr[i+1] = temp ; 
                    flag = false ;
                }
                
            }
            if(flag == true) break ; 
        }
        print(arr);
    }
}
