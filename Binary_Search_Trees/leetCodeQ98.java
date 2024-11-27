package Binary_Search_Trees;

public class leetCodeQ98 {
    public static boolean helper(Node root){
        if(root == null) return true ;
        if(root.left != null && root.left.val >= root.val) return false ;
        if(root.right != null && root.right.val <= root.val) return false ;
        return isValidBST(root.left) && isValidBST(root.right) ;
    }
    public static boolean left(Node root , int val){
        if(root == null) return true ;
        if(root.val >= val ) return false ;
        return left(root.left , val) && left(root.right , val) ;
    }
    public static boolean right(Node root , int val){
        if(root == null) return true ;
        if(root.val <= val ) return false ;
        return right(root.right , val) && right(root.left , val) ;
    }
    
    public static boolean isValidBST(Node root) {
        if (root == null)
            return true;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (root != null) {
            a = helper(root);
        }
        if (root.left != null) {
            b = left(root.left, root.val);
        }
        if (root.right != null) {
            c = right(root.right, root.val);
        }
        return a && b && c;

    }
    public static void main(String[] args) {
        Node a = new Node(5) ;
        Node b = new Node(1) ;
        Node c = new Node(4) ;
        Node d = new Node(3) ;
        Node e = new Node(6) ;

        a.left = b ;        a.right = c ;
        c.left = d ;        c.right = e ;


        System.out.println(isValidBST(a));
    }
}
