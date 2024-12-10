package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;


public class leetCodeQ114M3 {
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

    public static void flatten(Node root) {
        // Like Morris 
        Node curr = root ;
        while(curr != null){
            if(curr.left != null){
                Node r = curr.right ;
                curr.right = curr.left ;
                Node pred = curr.left ;
                while(pred.right != null)  
                        pred = pred.right ;
                pred.right = r ;
                curr.left = null ; // Importatnt
                curr = curr.right ;
            }
            else{
                curr = curr.right ;
            }
        }
    
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        display(a);
        System.out.println();

        flatten(a);

        display(a);
    }
}
