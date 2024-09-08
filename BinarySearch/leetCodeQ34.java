package BinarySearch;

public class leetCodeQ34 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8; 
        int n = arr.length ;
        int[] ans = {-1,-1} ;

        // First Check If Ele is present 
        int lo = 0 , hi = n - 1 ; 
        boolean flag = false ;    // false means not present 
        while (lo <= hi) {
            int mid = lo+(hi - lo)/2 ;
            if(arr[mid] == target){
                flag = true ; 
                break ;
            }
            else if(arr[mid] > target) hi = mid - 1 ;
            else if(arr[mid] < target) lo = mid + 1 ;
        }
        if(flag == false) print(ans);

        //  Now Find Lower Bound 
        lo = 0 ; hi = n-1 ; 
        int lb = n ; 
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid] >= target){
                lb = Math.min(lb,mid);
                hi = mid - 1 ;
            }
            else lo = mid + 1 ; 
        }
        ans[0] = lb ;
        
        // Now Find upper Bound 
        int ub = n ; 
        lo = 0 ; hi = n - 1 ; 
        while (lo <= hi) {
            int mid = lo+(hi - lo)/2 ;
            if(arr[mid] > target){
                ub = Math.min(ub , mid) ;
                hi = mid-1 ;
            }
            else  lo = mid + 1 ; 
        }
        ans[1] = ub-1 ;
        if(flag == true) print(ans);
        
    }
}
