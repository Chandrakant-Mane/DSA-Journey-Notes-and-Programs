package DynamicProgramming;

public class leetCodeQ1277 {
    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        
        int[][] matrix = { { 0, 1, 1, 1 } , { 1, 1, 1, 1 } , { 0, 1, 1, 1 }} ;

        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    continue;
                else if (i > 0 && j > 0) {
                    matrix[i][j] += min(matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]);
                }
                count += matrix[i][j];
            }
        }
        
        System.out.println(count);
    }
}
