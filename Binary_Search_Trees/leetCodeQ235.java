package Binary_Search_Trees;

public class leetCodeQ235 {
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null) return null ;
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left , p , q) ;
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right , p , q) ;
        return root ;
        
    }
    public static void main(String[] args) {
        Node a = new Node(6) ;
        Node b = new Node(2) ;
        Node c = new Node(8) ;
        Node d = new Node(0) ;
        Node e = new Node(4) ;
        Node f = new Node(7) ;
        Node g = new Node(9) ;
        Node i = new Node(3) ;
        Node j = new Node(5) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.left = f ;        c.right = g ;
        e.left = i ;        e.right = j ;

        Node p = i ;
        Node q = j ;

        System.out.println(lowestCommonAncestor(a, p, q).val);
    }
}
