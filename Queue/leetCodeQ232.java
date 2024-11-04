package Queue ;

import java.util.Stack;

public class leetCodeQ232 {
    public static class MyQueue{
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();

        }

        public int peek() {
            if (output.empty()) {
                while (!input.empty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.empty() && output.empty();
        }
    }
    public static void main(String[] args) {
        MyQueue que = new MyQueue() ;
        System.out.println(que.empty());
        que.push(1);
        que.push(2);
        que.push(3);
        que.push(4);
        que.push(5);

        System.out.println(que.peek());

        System.out.println(que.pop());
        System.out.println(que.peek());
        System.out.println(que.pop());
        System.out.println(que.peek());
        System.out.println(que.pop());
        System.out.println(que.peek());
        System.out.println(que.pop());
        que.push(10);
        System.out.println(que.peek());
        que.pop() ;
        System.out.println(que.peek());
        

        System.out.println(que.empty());
    }
}
