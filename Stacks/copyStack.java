package Stacks;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

        Stack<Integer> st_temp = new Stack<>() ;
        while (!st.isEmpty()) {
            st_temp.push(st.pop());
        }
        System.out.println(st_temp);

        Stack<Integer> st_final = new Stack<>() ;
        while(!st_temp.isEmpty()){
            st_final.push(st_temp.pop());
        }

        System.out.println(st_final);
    }
}
