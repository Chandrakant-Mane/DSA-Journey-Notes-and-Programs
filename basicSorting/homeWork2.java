package basicSorting;

public class homeWork2 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        //  Selection  Sort 
        for(int i = n-1 ; i >= 0 ; i--){
            int max = Integer.MIN_VALUE;
            int mindx = 0 ; 
            for (int j = i; j >= 0; j--) {
                if(arr[j] > max){
                    max = arr[j] ;
                    mindx = j ;
                } 
            }
            // Swap arr[i]  and  arr[mindx]
            swap(arr, i , mindx) ;
        }
        print(arr);
        
    }
}
