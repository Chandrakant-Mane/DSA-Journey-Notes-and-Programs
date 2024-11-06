package Queue ;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ649 {
    public static void main(String[] args) {
        String senate = "RD" ;
        Queue<Integer> r = new LinkedList<>() ;
        Queue<Integer> d = new LinkedList<>() ;
        int n = senate.length() ;

        for(int i = 0 ; i < n ; i++){
            if(senate.charAt(i) == 'R')
                r.add(i) ;
            else
                d.add(i) ;
        }

        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()){
                r.add(n++) ;
            }
            else
                d.add(n++) ;
            r.remove() ;
            d.remove() ;      
        }

        System.out.println(r.isEmpty() ? "Dire" : "Radiant");
    }
}
