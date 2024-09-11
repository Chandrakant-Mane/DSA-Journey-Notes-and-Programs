package AdvanceSorting;

public class mergeSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c) { // TC = O(m+n)
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (j < b.length)
            c[k++] = b[j++];
        while (i < a.length)
            c[k++] = a[i++];
            
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if(n==1) return ;  // Base Case 
        // Create two arrays of n/2 size each ..
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // Copy Pasting ..
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i + n/2];
        }

        // Magic ..
        mergesort(a);
        mergesort(b);

        // Merge These 'a' ans 'b' ..
        merge(a, b, arr);

        // Delete a and b .. 
        a = null ; b = null  ;  // Just to improve space complexity , TC will be same ...
    }

    public static void main(String[] args) {
        int[] arr = { 80, 30, 50, 20, 60, 10, 70, 40 };
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
