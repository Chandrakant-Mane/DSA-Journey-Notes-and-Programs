package Trees;

public class maxValue {
    private static void display(Node root) {
        if (root == null)
            return; // Base Case
        System.out.print(root.val + " "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }

    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int a = root.val , b = max(root.left) , c = max(root.right) ;
        int max = Math.max( a , Math.max(b , c )) ;
        return max ;
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

        display(a) ;
        System.out.println(); 

        System.out.println(max(a));

    }
}
