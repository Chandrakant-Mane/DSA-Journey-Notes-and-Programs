package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ225 {
    static class MyStack {
        //    push  efficient  Methode ;
        Queue<Integer> que = new LinkedList<>() ;

        public void push(int x) {  // T.C = O(1)
            que.add(x) ;
        }
    
        public int pop() {  //  T.C = O(n)
            for(int i = 0 ; i < que.size() - 1 ; i++){
                que.add(que.remove()) ;
            }
            int val = que.remove() ;
            return val ;
        }
    
        public int top() {   // T.C = O(n)
            for(int i = 0 ; i < que.size() - 1 ; i++){
                que.add(que.remove()) ;
            }
            int val = que.peek() ;
            que.add(que.remove()) ;
            return val ;
        }
    
        public boolean empty() {
            return (que.size() == 0);
        }


    }
    public static void main(String[] args) {
        MyStack q = new MyStack() ;
        System.out.println(q.empty());

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        
        System.out.println(q.que);
        
        System.out.println(q.pop());

        System.out.println(q.top());
        
        System.out.println(q.empty());

    }
}
