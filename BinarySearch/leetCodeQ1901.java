package BinarySearch;

public class leetCodeQ1901 {
    public static int maxEle(int[][] mat , int m , int mid){
        int mx = Integer.MIN_VALUE ;
        int idx = -1;
        for(int i = 0 ; i < m ; i++){
            if(mx < mat[i][mid]){
                mx = Math.max(mx , mat[i][mid]);
                idx = i ;
            } 
        }
        return idx ;
    }
    public static int lef(int[][] mat , int maxidx , int mid ) {
        if(mid-1 >= 0) 
            return mat[maxidx][mid-1] ;
        else return -1 ;
    }
    public static int rig(int[][] mat , int maxidx , int mid , int n ) {
        if(mid+1 < n) 
            return  mat[maxidx][mid+1] ;
        else return -1 ;
    }

    public static void main(String[] args) {
        int[][] mat = {{25,37,23,37,19} , {45,19,2,43,26} , {18,1,37,44,50}} ;
        int m = mat.length ;
        int[] ans = new int[2] ;
        int n = mat[0].length ;
        int lo = 0 , hi = n-1 ;
        int left , right ; 
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            int maxidx = maxEle(mat , m , mid) ;
            left = lef(mat , maxidx , mid) ;
            right = rig(mat , maxidx , mid , n) ;
            
            if(mat[maxidx][mid] > left && mat[maxidx][mid] > right){
                ans[0] = maxidx ;
                ans[1] = mid ;
                System.out.println(ans[0] + " " + ans[1]);
                break ;
            }
            else if(mat[maxidx][mid] < left)  hi = mid - 1 ;
            else lo = mid + 1 ;
        }
    }
    
}
