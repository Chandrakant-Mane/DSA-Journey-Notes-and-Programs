package Trees;

public class leetCodeQ226 {
    public static Node invertTree(Node root) {
        if(root == null) return null ;
        Node temp = root.left  ;
        root.left = root.right ;
        root.right = temp ;
        invertTree(root.left);
        invertTree(root.right) ;
        return root ;
    }
    static int n ;
    public static void nThLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == n)
            System.out.print(root.val + " ");
        nThLevel(root.left, level + 1);
        nThLevel(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b ;
        a.right = c ;
        b.left = d ;
        b.right = e ;
        c.left = f ;
        c.right = g ;
        n = 3 ;
        int x = n;
        for (int j = 0; j < x; j++) {
            n = j;
            nThLevel(a, 0);
            // System.out.println();
        }

        System.out.println();
        invertTree(a) ;

        for (int j = 0; j < x; j++) {
            n = j;
            nThLevel(a, 0);
            // System.out.println();
        }
    }
}
