package arrays;

public class leetCodeQ153 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2} ;
        int n = arr.length ;
        int lo = 1 , hi = n-2 ;
        int p = -1 ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo)/2 ; 
            if(arr[mid] > arr[mid+1]  &&  arr[mid] > arr[mid-1]){
                p = arr[mid+1] ;
                System.out.println(p);
                break ;
            }
            else if(arr[mid] < arr[mid+1]  &&  arr[mid] < arr[mid-1]){
                p = arr[mid] ;
                System.out.println(p);
                break ;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                if(arr[mid] > arr[n-1]) lo = mid + 1; 
                else hi = mid - 1 ;
            } 
        }
        if(p==-1){
            if(arr[0] < arr[n-1]) System.out.println(arr[0]);
            else System.out.println(arr[n-1]);
        }
    }
}
