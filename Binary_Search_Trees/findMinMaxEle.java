package Binary_Search_Trees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class findMinMaxEle {

    static int min(Node root){
        if(root == null) return Integer.MAX_VALUE ;
        int a = root.val ;
        int minLst = min(root.left) ;
        int minRst = min(root.right) ;
        return Math.min(a, Math.min(minLst, minRst)) ;
    }

    static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int a = root.val;
        int maxLst = max(root.left);
        int maxRst = max(root.right);
        return Math.max(a, Math.max(maxLst, maxRst));
    }

    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(5) ;
        Node c = new Node(15) ;
        Node d = new Node(2) ; 
        Node e = new Node(8) ;
        Node f = new Node(12) ;
        Node g = new Node(19) ;
        Node h = new Node(20) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.left = f ;        c.right = g ;
        f.right = h ;

        System.out.println(min(a.left));
        System.out.println(max(a.right));
    }
}
