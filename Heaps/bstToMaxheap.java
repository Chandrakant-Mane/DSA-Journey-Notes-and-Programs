package Heaps;

import java.util.ArrayList;
import java.util.List;

public class bstToMaxheap {
    static class Node {
        int val ;
        Node left ;
        Node right ;

        Node(int val ){
            this.val = val ;
        }
    }
    public static void helper(Node root , List<Integer> arr){
        if(root == null) return ;
        helper(root.right , arr) ;
        arr.add(root.val) ;
        helper(root.left , arr) ;
    }
    public static void post(Node root , List<Integer> arr){
        if(root == null) return ;
        post(root.left , arr) ;
        post(root.right , arr) ;
        root.val = arr.remove(arr.size() - 1) ;
        // System.out.print(root.val + " ");
    }
    
    public static void postP(Node root, List<Integer> arr) {
        if (root == null)
            return;
        postP(root.left, arr);
        postP(root.right, arr);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        Node a = new Node(4) ;
        Node b = new Node(2) ;
        Node c = new Node(6) ;
        Node d = new Node(1) ;
        Node e = new Node(3) ;
        Node f = new Node(5) ;
        Node g = new Node(7) ;

        a.left = b ;    a.right = c ;
        b.left = d ;    b.right = e ;
        c.left = f ;    c.right = g ;

        List<Integer> arr = new ArrayList<>() ;

        postP(a , arr) ;
       
        helper(a , arr) ;
        
        System.out.println() ;
        System.out.println(arr) ;
        
        post(a , arr) ;

        postP(a, arr);
    }
}
