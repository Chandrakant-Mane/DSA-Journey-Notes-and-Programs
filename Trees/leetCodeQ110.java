package Trees;

public class leetCodeQ110 {
    public static int lvl(Node root , boolean[] ans){
        if(root == null) return 0 ;
        int leftLevels = lvl(root.left , ans) ;
        int rightLevels = lvl(root.right , ans ) ;
        int diff = Math.abs( leftLevels - rightLevels ) ;
        if(diff > 1) ans[0] = false ;
        return 1 + Math.max( leftLevels , rightLevels) ; 
    }
    public static boolean isBalanced(Node root) {
        boolean[] ans = {true} ; 
        lvl(root , ans) ;
        return ans[0] ;
    } 
    public static void main(String[] args) {
        Node a = new Node(3) ;
        Node b = new Node(9) ;
        Node c = new Node(20) ;
        Node d = new Node(15) ;
        Node e = new Node(7) ;

        a.left = b ;    a.right = c ;
        c.left = d ;    c.right = e ;

        System.out.println(isBalanced(a));

    }
}
