package Queue;

import java.util.Stack;

public class leetCodeQ232M1 {
    static class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void push(int x) {
            if (st.size() == 0)
                st.push(x);
            else {
                while (st.size() > 0) {
                    helper.push(st.pop());
                }
                st.push(x);
                while (helper.size() > 0) {
                    st.push(helper.pop());
                }
            }
        }

        public int pop() {
            return st.pop();
        }

        public int peek() {
            return st.peek();
        }

        public boolean empty() {
            return st.size() == 0;
        }
        
        public static void main(String[] args) {
            MyQueue que = new MyQueue();
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
}
