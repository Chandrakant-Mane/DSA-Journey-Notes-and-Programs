package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ450 {
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
    public static Node iop(Node root){
        Node temp = root.left ;
        while(temp.right != null) 
            temp = temp.right ;
        return temp ;
    }
    public static Node parent(Node root , Node pred){
        if(root.left == pred || root.right == pred) return root ;
        Node temp = root.left ;
        while(temp.right != pred) 
            temp = temp.right ;
        return temp ;
    }
    public static Node deleteNode(Node root, int key) {
        if(root == null) return null ;
        if(root.val == key){  // deletion 
            // Case 1 : 0 Child Nodes
            if(root.left == null && root.right == null){
                return null ;
            }

            // Case 2 : 1 Child Nodes 
            else if(root.left == null || root.right == null){
                if(root.left == null)
                    return root.right ;
                else 
                    return root.left ;
            }

            // Case 3 : 2 Child Nodes 
            else{
                Node pred = iop(root) ;
                Node predParent = parent(root , pred) ;
                if(root == predParent){
                    pred.right = root.right ;
                    return pred ;
                }
                predParent.right = pred.left ;
                pred.left = root.left ; 
                pred.right = root.right ;
                return pred ;
            }
        }
        else if(root.val > key){ // LST will change  
            root.left = deleteNode(root.left , key) ;

        }
        else{ // root.val < key // RST will change 
            root.right = deleteNode(root.right , key) ;
        }
        return root ;
    }
    public static void main(String[] args) {
        Node a = new Node(5) ;
        Node b = new Node(3) ;
        Node c = new Node(6) ;
        Node d = new Node(2) ;
        Node e = new Node(4) ;
        Node f = new Node(7) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f  ;


        display(a);
        System.out.println();

        Node root = deleteNode(a, 3) ;
        display(root) ;
    }
}
