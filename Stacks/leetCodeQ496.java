package Stacks;

import java.util.Stack;

public class leetCodeQ496 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2};
        int[] nums2 = { 1, 3, 4, 2};
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        int[] ans1 = new int[m];
        ans1[m - 1] = -1;
        int i = m - 1;
        Stack<Integer> st = new Stack<>();
        st.push(nums2[m - 1]);
        while (i >= 0) {
            while (!st.isEmpty() && st.peek() <= nums2[i])
                st.pop();
            ans1[i] = st.isEmpty() ? -1 : st.peek();
            for (int j = 0; j < n; j++) {
                if (nums1[j] == nums2[i]) {
                    ans[j] = ans1[i];
                    break;
                }
            }
            st.push(nums2[i]);
            i--;
        }
        for(int ele : ans){
            System.out.print(ele + " ");
        }

    }
}
