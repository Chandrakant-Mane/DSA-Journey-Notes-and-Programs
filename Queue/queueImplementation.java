package Queue;

// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueImplementation {
    public static void main(String[] args) {
        // Queue<Integer> qu = new ArrayDeque<>() ;
        Queue<Integer> que = new LinkedList<>() ;
        // add or push operation in a queue 
        System.out.println("que is empty ? : " + que.isEmpty());

        que.add(1) ;
        que.add(2) ;
        que.add(3) ;
        que.add(4) ;
        que.add(5) ;
        System.out.println(que);
        System.out.println("size is : " +  que.size());
        
        que.remove() ;
        System.out.println(que);

        que.poll() ;
        System.out.println(que);

        System.out.println(que.peek());

        System.out.println("size is : " + que.size());

        System.out.println("que is empty ? : " +  que.isEmpty());

    }
}
