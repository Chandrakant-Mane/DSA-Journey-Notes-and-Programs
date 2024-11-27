package Binary_Search_Trees;

public class leetCodeQ98M2 {
    public static long min(Node root){
        if(root == null) return Long.MAX_VALUE ;
        long a = root.val ;
        long minLst = min(root.left) ;
        long minRst = min(root.right) ;
        return Math.min(a, Math.min(minLst, minRst)) ;
    }
    public static long max(Node root) {
        if (root == null)
            return Long.MIN_VALUE;
        long a = root.val;
        long maxLst = max(root.left);
        long maxRst = max(root.right);
        return Math.max(a, Math.max(maxLst, maxRst));
    }
    public static boolean isValidBST(Node root) {
        if(root == null) return true ;
        if(root.val <= max(root.left)) return false ;
        if(root.val >= min(root.right)) return false ;
        return isValidBST(root.left) && isValidBST(root.right) ;
         
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(6);

        a.left = b;     a.right = c;
        c.left = d;     c.right = e;

        System.out.println(isValidBST(a));

    }
}
