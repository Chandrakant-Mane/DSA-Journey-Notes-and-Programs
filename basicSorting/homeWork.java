package basicSorting;

public class homeWork {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int n = arr.length ;
        print(arr);

        // Bubble Sort Optimised . 
        for(int x = n-1 ; x >= 0 ; x-- ){        // n - 1 Passes
            boolean flag = true ;
            for (int i = n-1; i >= 1; i--) {
                if(arr[i] > arr[i-1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i-1] ;
                    arr[i-1] = temp ; 
                    flag = false ;
                }
                
            }
            if(flag == true) break ; 
        }
        print(arr);

    }
    
}
