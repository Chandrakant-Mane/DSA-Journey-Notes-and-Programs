package DynamicProgramming;

public class leetCodeQ647 {
    public static void main(String[] args) {
        String s = "aaa" ;
        int n = s.length();
        int count = 0;
        int[][] dp = new int[n][n];
        for (int k = 0; k < n; k++) { // Loop kitni baarr chl raha hai
            int i = 0, j = k;
            while (j < n) {
                if (i == j) { // If Length of Substring is 1 .
                    dp[i][j] = 1;
                    count++;
                }

                else if (j == i + 1) { // if Length of substring is 2 .
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                        count++;
                    }

                } else { // if Length of substring is more than 2 .
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            count++;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(count);
    }
}
