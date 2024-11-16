package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class gfgReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>() ;

        que.add(1) ;
        que.add(2) ;
        que.add(3) ;
        que.add(4) ;
        que.add(5) ;
        que.add(6) ;
        que.add(7) ;
        que.add(8) ;

        Stack<Integer> st = new Stack<>() ;
        int n = que.size() / 2 ;

        for(int i = 0 ; i < n ; i++){
            st.push(que.poll()) ;
        }
        System.out.println(st);
        while(!st.isEmpty()){
            que.add(st.pop()) ;
        }
        System.out.println(que);
        for (int i = 0; i < n; i++) {
            que.add(que.poll()) ;
        }
        System.out.println(que);

        for (int i = 0; i < n; i++) {
            st.push(que.poll());
        }
        
        System.out.println(que);
        System.out.println(st);
        while(!st.isEmpty()){
            que.add(st.pop()) ;
            que.add(que.remove()) ;
        }

        System.out.println(que);
    }
}
