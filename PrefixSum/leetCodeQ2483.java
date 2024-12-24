package PrefixSum;

public class leetCodeQ2483 {
    public static void main(String[] args) {
        String customers = "YYNY" ;

        int n = customers.length();
        int[] preN = new int[n + 1];
        int[] sufY = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            preN[i] = preN[i - 1];
            if (customers.charAt(i - 1) == 'N')
                preN[i] += 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (customers.charAt(i) == 'Y') {
                sufY[i] += sufY[i + 1] + 1;
            } else
                sufY[i] += sufY[i + 1];
        }
        int min = n + 5;
        for (int i = 0; i < n + 1; i++) {
            preN[i] += sufY[i];
            min = Math.min(min, preN[i]);
        }
        for (int i = 0; i < n + 1; i++) {
            if (preN[i] == min){
                System.out.println(i);
                break ;
            }
        }
    }
}
