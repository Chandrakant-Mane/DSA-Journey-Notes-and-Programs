package Stacks;

import java.util.Stack;

public class basicStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        st.push(10);
        st.push(20);

        //  To Access First Element Inserted In Stack 
        while (st.size() > 1) {
            st.pop() ;
        }
        // size has become 1 
        System.out.println(st.peek());
    }
}
