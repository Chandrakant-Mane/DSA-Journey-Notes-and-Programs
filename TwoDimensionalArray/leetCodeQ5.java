package TwoDimensionalArray;

public class leetCodeQ5 {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

        // int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }
        // };

        int m = arr.length, n = arr[0].length;

        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;
        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n / 2; j++) {

                for (int i1 = minr; i1 < minr + 1; i1++) {
                    for (int j1 = minc; j1 <= maxc; j1++) {
                        System.out.print(arr[i1][j1] + " ");
                    }
                }
                if (minr > maxr || minc > maxc)
                    break;
                for (int i2 = maxc; i2 <= maxc; i2++) {
                    minr++;
                    for (int j2 = minr; j2 <= maxr; j2++) {
                        System.out.print(arr[j2][i2] + " ");
                    }
                }
                if (minr > maxr || minc > maxc)
                    break;
                for (int i3 = maxr; i3 < maxr + 1; i3++) {
                    maxc--;
                    for (int j3 = maxc; j3 >= minc; j3--) {
                        System.out.print(arr[i3][j3] + " ");
                    }
                    maxr--;
                }
                if (minr > maxr || minc > maxc)
                    break;
                for (int i4 = minc; i4 < minc + 1; i4++) {
                    for (int j4 = maxr; j4 >= minr; j4--) {
                        System.out.print(arr[j4][i4] + " ");
                    }
                }
                minc++;

            }
        }

    }

}
