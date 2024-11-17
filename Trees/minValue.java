package Trees;

public class minValue {
    private static void display(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }

    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE ;
        }
        int a = root.val , b = min(root.left) , c = min(root.right) ;
        int min = Math.min(a, Math.min(b, c)) ;
        return min ;
    }
    public static void main(String[] args) {
        Node a = new Node(83);
        Node b = new Node(73);
        Node c = new Node(100);
        Node d = new Node(41);
        Node e = new Node(88);
        Node f = new Node(473);
        Node g = new Node(480);
        Node h = new Node(480);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = g;
        c.right = f;
        e.right = h;

        display(a);
        System.out.println();

        System.out.println(min(a));
    }

}
