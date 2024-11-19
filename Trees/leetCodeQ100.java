package Trees;


public class leetCodeQ100 {
    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true ;
        if(p == null || q == null) return false; 
        if(p.val != q.val) return false ;
        if(!isSameTree(p.left , q.left)) return false ;
        if(!isSameTree(p.right , q.right)) return false ;
        return true ;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        a.left = b ;
        a.right = c ;

        Node l = new Node(1) ;
        Node m = new Node(2) ;
        Node n = new Node(3) ;
        l.left = m ;
        l.right = n ;

        System.out.println(isSameTree(a , l)); 
    }
}
