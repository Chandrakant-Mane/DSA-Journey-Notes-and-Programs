package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ1038M2 {
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
    
    static int sum;
    public static void reverseInorder(Node root){
        if(root == null) return ;
        reverseInorder(root.right) ;
        root.val += sum ;
        sum = root.val ;
        reverseInorder(root.left) ;
    }
    public static Node bstToGst(Node root) {
        sum = 0 ;
        reverseInorder(root) ;
        return root ;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(1);
        Node c = new Node(6);
        Node d = new Node(0);
        Node e = new Node(2);
        Node f = new Node(5);
        Node g = new Node(7);
        Node i = new Node(3);
        Node j = new Node(8);

        a.left = b;     a.right = c;
        b.left = d;     b.right = e;
        c.left = f;     c.right = g;
        e.right = i;    g.right = j;

        display(a); 
        System.out.println();

        display(bstToGst(a));

    }
}
