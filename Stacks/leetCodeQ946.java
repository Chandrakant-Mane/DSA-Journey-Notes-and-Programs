package Stacks;

import java.util.Stack;

public class leetCodeQ946 {
    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5} ;
        int[] popped = {4,5,3,2,1} ;

        Stack<Integer> st = new Stack<>();
        // Put Pointer For Popped Array
        int j = 0;

        for (int val : pushed) {
            st.push(val);

            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        System.out.println(st.isEmpty());
    }
}
