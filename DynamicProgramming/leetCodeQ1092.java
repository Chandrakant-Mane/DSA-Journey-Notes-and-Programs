package DynamicProgramming;

public class leetCodeQ1092 {
    public static String LCS(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        StringBuilder str = new StringBuilder("");
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                str.append(a.charAt(i - 1));
                i--;
                j--;
            }

            else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }
        str.reverse();
        return str.toString();
    }
    public static void main(String[] args) {
        String a = "abac" ;
        String b = "cab" ;
        String lcs = LCS(a, b);
        int n = a.length(), m = b.length();
        int i = 0, j = 0, k = 0; // i -> a , j -> b , k -> lcs
        String scs = "";
        while (k < lcs.length()) {
            while (a.charAt(i) != lcs.charAt(k)) {
                scs += a.charAt(i);
                i++;
            }
            while (b.charAt(j) != lcs.charAt(k)) {
                scs += b.charAt(j);
                j++;
            }
            scs += lcs.charAt(k);
            i++;
            j++;
            k++;
        }
        while (j < m) {
            scs += b.charAt(j);
            j++;
        }
        while (i < n) {
            scs += a.charAt(i);
            i++;
        }

        System.out.println(scs);
    }
}
