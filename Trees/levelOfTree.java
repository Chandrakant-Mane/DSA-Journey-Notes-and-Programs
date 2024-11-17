package Trees;

public class levelOfTree {
    private static void display(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }

    public static int level(Node root){
        if(root == null){
            return 0 ;
        }
        int level = 1 + Math.max(level(root.left) , level(root.right)) ;
        return level ;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(41);
        Node e = new Node(88);
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

        System.out.println(level(a));
    }
}
