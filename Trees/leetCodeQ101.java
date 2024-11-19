package Trees;

public class leetCodeQ101 {
    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true ;
        if(p == null || q == null) return false; 
        if(p.val != q.val) return false ;
        if(!isSameTree(p.left , q.right)) return false ;
        if(!isSameTree(p.right , q.left)) return false ;
        return true ;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(2) ;
        Node d = new Node(3) ;
        Node e = new Node(4) ;
        Node f = new Node(3) ;
        Node g = new Node(4) ;

        a.left = b ;  a.right = c ;
        b.left = d ;  b.right = e ;
        c.left = g ;  c.right = f ;

        System.out.println(isSameTree(a.left , a.right));
    }
}
