package Stacks;

public class leetCode1614M2 {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))" ;
        int n = s.length();
        int depth = 0;
        int mxDepth = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                depth++;
            }
            if (s.charAt(i) == ')') {
                mxDepth = Math.max(depth, mxDepth);
                depth--;
            }
        }
        System.out.println(mxDepth);
    }
}
