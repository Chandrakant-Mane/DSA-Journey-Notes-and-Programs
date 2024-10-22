package Stacks ;

import java.util.Stack;

public class overflowAndUnderflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.push(7);
        System.out.println(st);
        st.pop() ;
        System.out.println(st);
        st.pop() ;
        System.out.println(st);
        st.pop() ;
        System.out.println(st);
        st.pop() ;
        System.out.println(st);
        st.pop() ;
        System.out.println(st);
        // st.pop() ;    //  Underflow Error 

    }
}
