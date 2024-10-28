package Stacks;

public class nextGreaterElementBrute {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length ;
        int[] res = new int[n] ;
        
        for(int i = 0; i < n; i++) {
            res[i] = -1 ;
            for(int j = i+1; j < n ; j++) {
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
