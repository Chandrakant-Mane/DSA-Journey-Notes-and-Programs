package arrays ;

public class leetCodeQ121 {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 } ;

        int mini = prices[0];
        int n = prices.length;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int cost = prices[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, prices[i]);
        }

        System.out.println(profit);
    }
}
