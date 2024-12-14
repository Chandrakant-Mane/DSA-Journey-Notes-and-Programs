package Hashmaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data ;
    Node right ;
    Node left ;

    Node(int data){
        this.data = data ;
    }
}
class Pair{
    Node node ;
    int level ;
    Pair(int level , Node node){
        this.level = level ;
        this.node = node ;
    }
}


public class topViemBinaryTree {
    public static void topView(Node root) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        Queue<Pair> q = new LinkedList<>() ;
        q.add(new Pair(0, root)) ;
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;

        while(q.size() > 0 ){
            Pair temp = q.remove() ;
            Node n = temp.node ;
            int lvl = temp.level ;

            minLevel = Math.min(minLevel, lvl) ;
            maxLevel = Math.max(maxLevel, lvl) ;
            if(!map.containsKey(lvl)){
                map.put(lvl, n.data) ;
            }
            if(n.left != null)      q.add(new Pair(lvl-1, n.left)) ;
            if(n.right != null)      q.add(new Pair(lvl+1, n.right)) ;
        }

        for(int i = minLevel ; i <= maxLevel ; i++){
            System.out.print(map.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Node a = new Node(0) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(4) ;
        Node e = new Node(5) ;
        Node f = new Node(6) ;
        Node g = new Node(7) ;
        Node h = new Node(9) ;
        Node i = new Node(8) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f ;
        d.left = g ;         d.right = h ;
        e.right = i ;

        topView(a);


    }
}
