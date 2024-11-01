package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class removeEvenIdxEle {
    static Queue<Integer> que ;
    static Queue<Integer> newQueue ;


    public static void removeEven(){
        newQueue = new LinkedList<>() ;
        while (!que.isEmpty()) {
            que.remove() ;
            if(!que.isEmpty())
                newQueue.add(que.remove()) ;
        }
        que = newQueue ;
    }
    public static void main(String[] args) {
        que = new LinkedList<>() ;
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
        removeEven() ;
        System.out.println(que);
        
    }
}
