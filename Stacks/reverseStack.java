package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(int top , Stack<Integer> st){
        Stack<Integer> temp = new Stack<>() ;
        while(st.size() > 0){
            temp.push(st.pop());
        }
        st.push(top);
        while(temp.size() > 0){
            st.push(temp.pop());
        }
    }
    
    public static void pushAtBottomRec(int x, Stack<Integer> st) {
        if(st.size()==0){ 
            st.push(x);
            return ;
        }
        int top = st.pop() ;
        pushAtBottomRec(x , st);
        st.push(top);

    }
    public static void recursive(Stack<Integer> st){
        if(st.size() == 1 ) return ;
        int top = st.pop() ;
        recursive(st);
        pushAtBottomRec(top , st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);
        recursive(st);
        System.out.println(st);

        // Stack<Integer> st_reversed = new Stack<>() ;
        // System.out.println(st_reversed.isEmpty());
        // while (!st.isEmpty()) {
        //     // int element = st.pop() ;
        //     // st_reversed.push(element);
        //     st_reversed.push(st.pop());
        // }
        // System.out.println(st_reversed);
        // System.out.println(st);
        // recursive(st_reversed);
        // System.out.println(st_reversed);
    }
} 
