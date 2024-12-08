package Stacks;

import java.util.Stack;

public class leetCodeQ1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1" ;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int depth = 0;
        int mxDepth = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                depth++;
            }
            if (s.charAt(i) == ')') {
                mxDepth = Math.max(depth, mxDepth);
                depth--;
                st.pop();
            }
        }

        System.out.println(mxDepth);
    }
}
