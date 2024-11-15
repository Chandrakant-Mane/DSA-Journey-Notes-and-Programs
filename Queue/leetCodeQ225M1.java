package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ225M1 {
    static class MyStack {
        //  Pop efficient Method 
        Queue<Integer> q = new LinkedList<>() ;
 
        public void push(int x) {  // T.C = O(n)
            if(q.size() == 0) q.add(x) ;
            else{
                q.add(x) ;
                for(int i = 0 ; i < q.size() - 1 ; i++){
                    q.add(q.remove()) ;
                }
            }
        
        }
    
        public int pop() {   // T.C = O(1)
            return q.remove() ;
        }
    
        public int top() {   // T.C = O(1)
            return q.peek() ;
        }
    
        public boolean empty() {
            return (q.size() == 0);
        }
    }
    public static void main(String[] args) {
        MyStack que = new MyStack() ;
        System.out.println(que.empty());

        que.push(10);
        que.push(20);
        que.push(30);
        que.push(40);
        que.push(50);
        
        System.out.println(que.q);

        System.out.println(que.pop());

        System.out.println(que.top());

        System.out.println(que.empty());
    }
}
