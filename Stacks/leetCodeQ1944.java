package Stacks ;

import java.util.Stack;

public class leetCodeQ1944 {
    public static void main(String[] args) {
        int[] heights = {10,6,8,5,11,9};
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] <= heights[i]) {
                res[st.peek()]++;
                st.pop();
            }
            if (!st.isEmpty()) {
                res[st.peek()]++;

            }
            st.push(i);
        }

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
