package Binary_Search_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetCodeQ114 {
    public static void display(Node root){
        Queue<Node> q = new LinkedList<>() ;
        if(root != null)    q.add(root) ;
        while (q.size() > 0) {
            Node front = q.remove() ;
            System.out.print(front.val + " ");  
            if(front.left != null)  q.add(front.left) ;
            if(front.right != null) q.add(front.right) ;
        }
    }
    public static void preorder(Node root , List<Node> pre){
        if(root == null) return ;
        pre.add(root) ;
        preorder(root.left , pre) ;
        preorder(root.right , pre) ;
    }
    public static void flatten(Node root) {
        List<Node> pre = new ArrayList<>() ;
        preorder(root , pre) ;
        int n = pre.size() ;
        for(int i = 0 ; i < n ; i++){
            if(i != n-1) pre.get(i).right = pre.get(i+1) ;
            pre.get(i).left = null ;
        }
    
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(5) ;
        Node d = new Node(3) ;
        Node e = new Node(4) ;
        Node f = new Node(6) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f ;

        display(a);
        System.out.println();
        flatten(a);

        display(a);

    }
}
