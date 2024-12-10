package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ114M2 {
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
        if(root == null) return ;
        if(root.left == null && root.right == null) return ;
        Node lst = root.left ;
        Node rst = root.right ;
        flatten(lst) ;
        flatten(rst) ;
        root.left = null ;
        root.right = lst ;
        Node temp = root ;
        while(temp.right != null){
            temp = temp.right ;
        }
        temp.right = rst ;
    
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
