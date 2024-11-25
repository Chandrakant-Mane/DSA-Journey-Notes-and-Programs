package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ701 {
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
    public static void insert(Node root , int val){
        if(val < root.val){
            // Attach to left 
            if(root.left == null){
                root.left = new Node(val) ;
                return ;
            }
            else{
                insert(root.left , val) ;
            }
        }
        else if(val > root.val) {
            // Attach to right 
            if(root.right == null){
                root.right = new Node(val) ;
                return ;
            }
            else{
                insert(root.right , val) ;
            }

        }
    }
    public static Node insertIntoBST(Node root, int val) {
        if(root == null) return new Node(val) ;
        insert(root , val) ;
        return root ;
    }
    public static void main(String[] args) {
        Node a = new Node(4) ;
        Node b = new Node(2) ; 
        Node c = new Node(7) ;
        Node d = new Node(1) ;
        Node e = new Node(3) ;


        a.left = b ;        a.right = c ;
        b.left = d ;        a.right = e ;
        display(a);
        System.out.println();

        Node root = insertIntoBST(a, 5) ;

        display(root);


    }
}
