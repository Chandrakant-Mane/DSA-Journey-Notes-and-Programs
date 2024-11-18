package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelOrderTraversal {
    // Using Queue 
    // From Left To Right 
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>() ;
        if(root != null)    q.add(root) ;
        while (q.size() > 0) {
            Node front = q.remove() ;
            System.out.print(front.val + " ");  
            if(front.left != null)  q.add(front.left) ;
            if(front.right != null) q.add(front.right) ;
        }
    }
    // From Right To Left 
    public static void levelOrderRToL(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.right != null)
                q.add(front.right);
            if (front.left != null)
                q.add(front.left);
        }
    }

    // Without Using Queue
    static int n;
    // From Left To Right 
    public static void nThLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == n)
            System.out.print(root.val + " ");
        nThLevel(root.left, level + 1);
        nThLevel(root.right, level + 1);
    } 

    // From Right To Left 
    public static void nThLevelRToL(Node root, int level) {
        if (root == null)
            return;
        if (level == n)
            System.out.print(root.val + " ");
        nThLevelRToL(root.right, level + 1);
        nThLevelRToL(root.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
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
        e.left = h;     f.right = i;

        System.out.println("Level Order Using Queue : ");
        System.out.println();
        System.out.print("Left To Right : ");
        levelOrder(a) ;
        System.out.println();
        System.out.println();
        System.out.print("Right To Left : ");
        levelOrderRToL(a) ;
        System.out.println();

        System.out.println();
        System.out.println("Level Order Without Using Queue : ");
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Left To Right : ");
        int x = n;
        for (int j = 0; j < x; j++) {
            n = j;
            nThLevel(a, 0);
            // System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.print("Right To Left : ");

        for (int j = 0; j < x; j++) {
            n = j;
            nThLevelRToL(a, 0);
            // System.out.println();
        }
        
        sc.close();
    }
}
