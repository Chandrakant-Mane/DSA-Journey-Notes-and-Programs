package PrefixSum;

public class leetCodeQ1109 {
    public static void main(String[] args) {
        int[][] bookings = { { 1, 2, 10 } , { 2, 3, 20 } , { 2, 5, 25 }} ;
        int n = 5 ;

        int[] ans = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];
            ans[first - 1] += seats;
            if (last < n)
                ans[last] -= seats;
        }
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i - 1];
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
