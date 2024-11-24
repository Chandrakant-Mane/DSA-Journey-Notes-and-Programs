package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ700 {
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
    public static Node searchBST(Node root, int val) {
        if(root == null) return null ;
        if(root.val == val) return root ;
        if(val < root.val){
            // Go left 
            return searchBST(root.left , val);
        }
        else{
            return searchBST(root.right , val);
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4) ;
        Node b = new Node(2) ;
        Node c = new Node(7) ;
        Node d = new Node(1) ;
        Node e = new Node(3) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;

        Node root = searchBST(a, 2) ;

        display(root);

    }
}
