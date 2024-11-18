package Trees;

import java.util.Scanner;

public class printNthLevel {
    static int n ;
    public static void nThLevel(Node root , int level){
        if(root == null) return ;
        if(level == n) 
            System.out.print(root.val + " ");
        nThLevel(root.left, level + 1 );
        nThLevel(root.right, level+1 );
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
        System.out.print("Enter n : ");
        n = sc.nextInt() ;
        // int x = n ;
        // for(int j = 0 ; j < x; j++){
        //     n = j ;
        //     nThLevel(a, 0);
        //     System.out.println();
        // }
        nThLevel(a, 0) ;
        sc.close();
    }
}
