package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueReverse {
    // static Queue<Integer> que ; 
    public static void print(Queue<Integer> que){
        // while (!que.isEmpty()) {
        //     System.out.print(que.peek() + " ");
        //     que.remove() ;
        // }
        System.out.println(que);
    }
    public static void reverseQueue(Queue<Integer> que ){
        Stack<Integer> st = new Stack<>() ;
        while (!que.isEmpty()){
            st.push(que.remove())  ;
        }
        while(!st.isEmpty()){
            que.add(st.pop()) ;
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>() ;
        que.add(10) ;
        que.add(20) ;
        que.add(30) ;
        que.add(40) ;
        que.add(50) ;
        que.add(60) ;
        que.add(70) ;
        que.add(80) ;
        que.add(90) ;
        que.add(100) ;
        System.out.println(que);

        reverseQueue(que) ;
       
        print(que) ;


    }
}
