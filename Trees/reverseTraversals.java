package Trees;

public class reverseTraversals {
    private static void reversePreorder(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        reversePreorder(root.right); // Left SubTree
        reversePreorder(root.left); // Right SubTree
    }

    private static void reverseInorder(Node root) {
        if (root == null)
            return; // Base Case
        reverseInorder(root.right); // Left SubTree
        System.out.print(root.val + " "); // Self
        reverseInorder(root.left); // Right SubTree
    }

    private static void reversePostorder(Node root) {
        if (root == null)
            return; // Base Case
        reversePostorder(root.right); // Left SubTree
        reversePostorder(root.left); // Right SubTree
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

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        System.out.print("Preorder : ");
        reversePreorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        reverseInorder(a);
        System.out.println();
        System.out.print("Postorder : ");
        reversePostorder(a);
    }
}
