package basicSorting;

public class transformArray {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23} ;
        int n = arr.length ;
        print(arr);
        //           3 , 0 , 5 , 2 , 6 , 4 , 1
        int x = 0 ; 
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE ;
            int mindx = -1 ; 
            for (int j = 0; j < n; j++) {
                if(arr[j] < min && arr[j] > 0){
                    min = arr[j] ;
                    mindx = j ;
                }
                
            }
            arr[mindx] = x ;
            x-- ;
        }
        print(arr);
        // for(int ele : arr){
        //     ele *= (-1) ;    Not Possible using for each loop 
        // }
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1) ;
        }
        print(arr);
    }
}
