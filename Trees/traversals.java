package Trees;

public class traversals {

    //   LeetCode Q No. 144 

    private static void preorder(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        preorder(root.left); // Left SubTree
        preorder(root.right); // Right SubTree
    }

    //   LeetCode Q No. 94 
    
    private static void inorder(Node root) {
        if (root == null)
            return; // Base Case
        inorder(root.left); // Left SubTree
        System.out.print(root.val + " "); // Self
        inorder(root.right); // Right SubTree
    }

    //   LeetCode Q No. 145 

    private static void postorder(Node root) {
        if (root == null)
            return; // Base Case
        postorder(root.left); // Left SubTree
        postorder(root.right); // Right SubTree
        System.out.print(root.val + " "); // Self

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;     a.right = c;
        b.left = d;     b.right = e;
        c.left = f;     c.right = g;
        e.left = h; 
        f.right = i ;

        System.out.print("Preorder : ");
        preorder(a) ;
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a) ;
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a) ;
    }
}
