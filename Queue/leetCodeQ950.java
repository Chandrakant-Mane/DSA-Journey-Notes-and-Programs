package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ950 {
    public static void main(String[] args) {
        int[] deck = { 17, 13, 11, 2, 3, 5, 7} ;
        int n = deck.length ;
        Arrays.sort(deck) ;
        Queue<Integer> q = new LinkedList<>() ;
        for(int i = 0 ; i < n ; i++)
            q.add(i) ;
        int[] res = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            res[q.poll()] = deck[i] ;
            q.add(q.poll()) ;
        }

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
