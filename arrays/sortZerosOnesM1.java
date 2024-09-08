package arrays;

public class sortZerosOnesM1 {
    public static void main(String[] args) {
        int[] arr = {0 , 0 , 0 , 1 , 1 , 1};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        int n = arr.length;
        int i = 0 , j = n-1 ;
        while(i<j){
            if(arr[i] == 0 ) i++;
            else if(arr[j] == 1 ) j--;
            // if(i>j) break;
            // if((i<j) && arr[i] == 1 && arr[j] == 0){
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0 ;
                arr[j] = 1 ;
                i++ ;
                j-- ;

            }
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
