package BitManipulation;

public class leetCodeQ1310 {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length, m = queries.length;
        int[] ans = new int[m];
        for (int i = 1; i < n; i++) {
            arr[i] ^= arr[i - 1];
        }
        for (int i = 0; i < m; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left != 0)
                ans[i] = arr[left - 1] ^ arr[right];
            else
                ans[i] = arr[right];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 8 };
        int[][] queries = { { 0, 1 } , { 1, 2 } , { 0, 3 } , { 3, 3 }} ;

        int[] ans = xorQueries(arr, queries) ;

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
