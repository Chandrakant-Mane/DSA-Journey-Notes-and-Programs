package Stacks;

import java.util.Stack;

public class removeFromBottom {
    public static void main(String[] args) {
        //  Home Work...
        Stack<Integer> st = new Stack<>() ;
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 1) {
            temp.push(st.pop());
        }
        st.pop() ;
        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
