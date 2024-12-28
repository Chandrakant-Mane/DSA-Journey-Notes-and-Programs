package SlidingWindows ;

public class leetCodeQ1493 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1} ;
        int n = arr.length, i = 0, j = 0;
        int z = 0;
        for (int ele : arr) {
            if (ele == 0)
                z++;
        }
        if (z == 0)
            System.out.println(n-1);

        int zeroes = 0, maxLen = 0;
        while (i < n && arr[i] == 0) {
            i++;
        }
        if (i == n)
           System.out.println(0);
        j = i;
        while (j < n) {
            if (arr[j] == 1)
                j++;
            else {
                if (zeroes == 0) {
                    j++;
                    zeroes++;
                } else {
                    int len = j - i - 1;
                    maxLen = Math.max(maxLen, len);
                    j++;
                    while (i < n && arr[i] == 1)
                        i++;
                    i++;
                }
            }
        }
        if (zeroes == 0)
            System.out.println(j-i);
        int len = j - i - 1;
        maxLen = Math.max(maxLen, len);
        System.out.println(maxLen);
    }
}
