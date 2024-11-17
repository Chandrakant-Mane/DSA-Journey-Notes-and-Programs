package Trees;

public class sizeOfTree {
    private static void display(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }

    public static int size(Node root){
        if(root == null) return 0 ;
        int size = 1 + size(root.left) + size(root.right) ;
        return size ;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
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

        System.out.println(size(a));
    }
}
