package Trees;

public class leetCodeQ236 {
    public static boolean ifExist(Node root, Node x){
        if(root == null) return false ;
        if(root == x) return true ;
        return ifExist(root.right, x) || ifExist(root.left, x ) ;
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p == root || q == root) return root ;
        boolean pLiesInLST = ifExist(root.left , p) ;
        boolean qLiesInLST = ifExist(root.left , q) ;
        if(pLiesInLST && qLiesInLST) return lowestCommonAncestor(root.left , p , q) ;
        if(!pLiesInLST && !qLiesInLST) return lowestCommonAncestor(root.right , p , q) ;
        else return root ;
    }
    public static void main(String[] args) {
        Node a = new Node(3) ;
        Node b = new Node(5) ;
        Node c = new Node(1) ;
        Node d = new Node(6) ;
        Node e = new Node(2) ;
        Node f = new Node(0) ;
        Node g = new Node(8) ;
        Node h = new Node(7) ;
        Node i = new Node(4) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.left = f ;        c.right = g ;
        e.left = h ;        e.right = i ;

        Node p = b ;
        Node q = c ;

        System.out.println(lowestCommonAncestor(a, p, q).val);


    } 
}
