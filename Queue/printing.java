package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class printing {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>() ;
        que.add(1) ;
        que.add(2) ;
        que.add(3) ;
        que.add(4) ;
        que.add(5) ;

        for(int i = 0 ; i < que.size() ; i++) {
            int x = que.peek() ;
            System.out.print(x + " ");
            que.remove() ;
            que.add(x) ;
        }
        System.out.println();
        System.out.println(que);
    }
}
