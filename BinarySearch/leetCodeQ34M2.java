package BinarySearch;

public class leetCodeQ34M2 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8 ; 
        int n = arr.length ;
        int[] ans = new int[2] ;
        int lo , hi ;
        
        // First Position 
        int fp = -1 ; lo = 0 ; hi = n-1 ;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid] == target){
                if(mid>0 && arr[mid] == arr[mid-1]) hi = mid - 1 ;
                else {
                    fp = mid ; 
                    break ;
                } 
            }
            else if(arr[mid] < target) lo = mid + 1 ;
            else if(arr[mid] > target) hi = mid - 1 ;
        }

        // Last Position 
        int lp = -1 ; lo = 0 ; hi = n-1 ;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid] == target){
                if(mid+1<n && arr[mid] == arr[mid+1]) lo = mid + 1 ;
                else {
                    lp = mid ; 
                    break ;
                } 
            }
            else if(arr[mid] < target) lo = mid + 1 ;
            else if(arr[mid] > target) hi = mid - 1 ;
        }

        ans[0] = fp ; ans[1] = lp ;
        print(ans);
    }
}
