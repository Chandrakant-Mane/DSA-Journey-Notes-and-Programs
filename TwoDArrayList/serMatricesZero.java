package TwoDArrayList;

public class serMatricesZero {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int m = arr.length, n = arr[0].length;
        int[][] helper = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper[i][j] == 0) {
                    for (int a = 0; a < n; a++) {
                        arr[i][a] = 0 ;
                    }
                    for (int b = 0; b < m; b++) {
                        arr[b][j] = 0 ;
                    }
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(helper[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
