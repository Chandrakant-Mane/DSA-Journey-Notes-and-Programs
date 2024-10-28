package Stacks;

import java.util.Stack;

public class leetCodeQ155 {
    public static class MinStack{
        static Stack<Long> st = new Stack<>() ;
        static long min = -1 ;

        public static void push(int val) {
            long x = (long) val;
            if (st.size() == 0) {
                st.push(x);
                min = x;
            } else if (val < min) {
                st.push(2 * x - min);
                min = x;
            } else if (x >= min) {
                st.push(x);
            }
        }

        public static void pop() {
            if (st.size() == 0)
                return;
            if (st.peek() >= min) {
                st.pop();
            } else if (st.peek() < min) {
                long old = 2 * min - st.peek();
                min = old;
                st.pop();
            }
        }

        public static int top() {
            if (st.size() == 0)
                return -1;
            long q = st.peek();
            if (q >= min)
                return (int) (q);
            if (q < min)
                return (int) min;
            return 0;
        }

        public static  int getMin() {
            if (st.size() == 0)
                return -1;
            return (int) min;
        }
    }
    public static void main(String[] args) {
        MinStack.push(7);
        MinStack.push(8);
        MinStack.push(5);
        MinStack.push(6);
        MinStack.push(3);
        MinStack.push(4);

        System.out.println(MinStack.top());
        System.out.println(MinStack.getMin()); 
        MinStack.pop(); 
        System.out.println(MinStack.getMin());
        MinStack.pop();
        System.out.println(MinStack.getMin());
    }
}
