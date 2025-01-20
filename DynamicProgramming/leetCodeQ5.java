package DynamicProgramming;

public class leetCodeQ5 {
    public static void main(String[] args) {
        String s = "babad" ;
        int n = s.length();
        int st = 0, end = 0;
        int[][] dp = new int[n][n];
        for (int k = 0; k < n; k++) {
            int i = 0, j = k;
            while (j < n) {
                if (i == j) {
                    dp[i][j] = 1;
                    st = i;
                    end = j;
                }

                else if (j == i + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                        st = i;
                        end = j;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            st = i;
                            end = j;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(s.substring(st, end + 1));
    }
}
