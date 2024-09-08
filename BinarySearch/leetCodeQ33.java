package BinarySearch;

public class leetCodeQ33 {
    public static int bs(int[] arr , int lo , int hi , int target) {
        while(lo <= hi){
            int mid = lo + (hi - lo)/2 ; 
            if(arr[mid] == target ) return mid ;
            else if(arr[mid] > target) hi = mid - 1 ;
            else lo = mid + 1 ;
        }
        return -1 ;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7} ;
        int target = 5 ;
        // Find Pivot  
        int n = arr.length ;
        if(n<=2){
            for (int i = 0; i < n; i++) {
                if(arr[i]==target) System.out.println(i); 
            }
            // System.out.println(-1);
        }
        int lo = 1 , hi = n-2 ;
        int p = -1 ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo)/2 ; 
            if(arr[mid] > arr[mid+1]  &&  arr[mid] > arr[mid-1]){
                p = mid ;
                break ;
            }
            else if(arr[mid] < arr[mid+1]  &&  arr[mid] < arr[mid-1]){
                p = mid-1 ;
                break ; 
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                if(arr[mid] > arr[n-1]) lo = mid + 1; 
                else hi = mid - 1 ;
            }
            
        }
        if(p==-1){ // array was never rotated 
            System.out.println(bs(arr,0,n-1,target)); 
        }
        int left = bs(arr,0,p,target);
        if(left!=-1) System.out.println(left); 
        int right = bs(arr,p+1,n-1,target);
        System.out.println(right);
        
    }
    
}
