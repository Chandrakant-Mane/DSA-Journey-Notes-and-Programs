package Trees;

class Node{
    int val ;
    Node left ;
    Node right ;
    Node(int val){
        this.val = val ;
    }
}

public class nodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1) ; // a is the Root 

        Node b = new Node(41) ;
        Node c = new Node(3) ;

        Node d = new Node(2) ; 
        Node e = new Node(6) ;
        Node f = new Node(5) ;

        System.out.println(a.val);
        System.out.println(a.left); 
        System.out.println(a.right);

        a.left = b ;    a.right = c ;

        b.left = d ;    b.right = e ;

        c.right = f ;
        System.out.println(b.val);
        System.out.println(a.left.val);

        e.val = 90 ;
        System.out.println(e.val);
        a.left.right.val = 56 ;
        System.out.println(e.val);
        System.out.println(a.left.right.val);
        
    }
}
