package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void recursive(Stack<Integer> st){
        if(st.empty() ) return ;
        System.out.print(st.pop() + " ");
        recursive(st);
        st.push(st.peek());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);
        // recursive(st);
        System.out.println();

        Stack<Integer> st_reversed = new Stack<>() ;
        System.out.println(st_reversed.isEmpty());
        while (!st.isEmpty()) {
            // int element = st.pop() ;
            // st_reversed.push(element);
            st_reversed.push(st.pop());
        }
        System.out.println(st_reversed);

        recursive(st_reversed);
    }
}
