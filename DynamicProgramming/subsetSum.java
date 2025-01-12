package DynamicProgramming;

public class subsetSum {
            // Recursion + Memoization   
    public static boolean subset(int[] arr , int target , int idx , int[][] dp){
        if(idx == arr.length){
            if (target == 0)
                return true;
            else return false ;
        }
        if(dp[idx][target] != -1) return (dp[idx][target] == 1) ;
        boolean ans = false ;
        boolean skip = subset(arr, target, idx+1 , dp) ;
        if(target - arr[idx] < 0) ans = skip ;  //  Only Valid for +ve No.
        else{
            boolean take = subset(arr, target - arr[idx], idx + 1, dp);
            ans = skip || take;
        } 
        dp[idx][target] = (ans) ? 1 : 0 ;
        return  ans;
    }

    public static boolean subsetRev(int[] arr, int target, int idx, int[][] dp) {
        if (idx == -1) {
            if (target == 0)
                return true;
            else
                return false;
        }
        if (dp[idx][target] != -1)
            return (dp[idx][target] == 1);
        boolean ans = false;
        boolean skip = subsetRev(arr, target, idx - 1, dp);
        if (target - arr[idx] < 0)
            ans = skip; // Only Valid for +ve No.
        else {
            boolean take = subsetRev(arr, target - arr[idx], idx - 1, dp);
            ans = skip || take;
        }
        dp[idx][target] = (ans) ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 8 , 1 , 2 , 4 } ;
        int target = 15 ;
        // i = 0  to  n-1  |  target = target to 0 
        int[][] dp = new int[arr.length][target+1] ;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1 ;
            }
        }
        System.out.println(subset(arr, target, 0 , dp));

        // Tabulation 

    }
}
