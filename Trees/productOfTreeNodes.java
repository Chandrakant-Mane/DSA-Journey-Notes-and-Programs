package Trees;

public class productOfTreeNodes {
    private static void display(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }

    public static int product(Node root) {
        if (root == null) {
            return 1;
        }
        int pro ;
        if (root.val == 0) {
            pro = 1 * product(root.left) * product(root.right);
        } else
            pro = root.val * product(root.left) * product(root.right);
        return pro;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(0);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = g;
        c.right = f;
        e.right = h;

        display(a);
        System.out.println();

        System.out.println(product(a));
    }
}
