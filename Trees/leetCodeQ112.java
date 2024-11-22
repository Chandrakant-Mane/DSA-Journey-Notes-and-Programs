package Trees;


public class leetCodeQ112 {
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false ;
        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0 ) return true ;
        }
        if(hasPathSum(root.left , targetSum - root.val)) return true ;
        if(hasPathSum(root.right , targetSum - root.val)) return true  ;
        return false ;
    }
    public static void main(String[] args) {
        Node a = new Node(5) ;
        Node b = new Node(4) ;
        Node c = new Node(8) ;
        Node d = new Node(11) ;
        Node e = new Node(13) ;
        Node f = new Node(4) ;
        Node g = new Node(7) ;
        Node h = new Node(2) ;
        Node i = new Node(1) ;

        a.left = b ;        a.right = c ;
        b.left = d ;
        d.left = g ;        d.right = h ;
        c.left = e ;        c.right = f ;
        f.right = i ;

        int targetSum = 22 ;

        System.out.println(hasPathSum(a, targetSum));


    }
}
