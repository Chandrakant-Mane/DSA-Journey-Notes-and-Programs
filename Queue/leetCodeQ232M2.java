package Queue;

import java.util.Stack;

public class leetCodeQ232M2 {
    static class MyQueue {
        //  push efficient Mehod 
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void push(int x) { // T.C = O(1)
            st.push(x);
        }

        public int pop() {
            while (st.size() > 1) {  // T.C = O(n)
                helper.push(st.pop());
            }
            int x = st.pop();
            while (helper.size() > 0) {
                st.push(helper.pop());
            }
            return x;
        }

        public int peek() {    // T.C = O(n)
            while (st.size() > 1) {
                helper.push(st.pop());
            }
            int x = st.peek();
            while (helper.size() > 0) {
                st.push(helper.pop());
            }
            return x;
        }

        public boolean empty() {
            return st.size() == 0;
        }
    }
    public static void main(String[] args) {
        MyQueue que = new MyQueue() ;
        System.out.println(que.empty());

        que.push(10);
        que.push(20);
        que.push(30);
        que.push(40);
        que.push(50);

        System.out.println(que.st);

        System.out.println(que.pop());
        System.out.println(que.st);

        System.out.println(que.peek());

        System.out.println(que.empty());
    }
}
