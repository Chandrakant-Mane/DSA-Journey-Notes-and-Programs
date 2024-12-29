package SlidingWindows ;

public class leetCodeQ1052 {
    public static void main(String[] args) {
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 } ;
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1} ;
        int minutes = 3 ;

        int n = customers.length, i = 0, j = minutes - 1, unSatisfied = 0;
        int a = i, b = j, maxUnsatisfied = 0;
        for (int x = i; x <= j; x++) {
            if (grumpy[x] == 1)
                unSatisfied += customers[x];
        }

        while (j < n) {
            if (maxUnsatisfied < unSatisfied) {
                maxUnsatisfied = unSatisfied;
                a = i;
                b = j;
            }
            i++;
            j++;
            if (j < n && grumpy[j] == 1)
                unSatisfied += customers[j];
            if (grumpy[i - 1] == 1)
                unSatisfied -= customers[i - 1];
        }
        for (int x = a; x <= b; x++) {
            grumpy[x] = 0;
        }

        int satisfied = 0;

        for (i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        System.out.println(satisfied);
    }
}
