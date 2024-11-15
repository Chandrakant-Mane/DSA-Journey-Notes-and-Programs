package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKEle {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>() ;
        que.add(10) ;
        que.add(20) ;
        que.add(30) ;
        que.add(40) ;
        que.add(50) ;

        System.out.println(que);
        int k = 3 ;

        Stack<Integer> st = new Stack<>() ;

        for(int i = 0 ; i < k ; i++){
            st.push(que.remove()) ;
        }

        while(st.size() > 0){
            que.add(st.pop()) ;
        }

        System.out.println(que);

        for(int i = 0 ; i < que.size() - k ; i++){
            que.add(que.remove()) ;  
        }

        System.out.println(que);
    }
}
