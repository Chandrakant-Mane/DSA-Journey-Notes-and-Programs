package DynamicProgramming;

import java.util.HashMap;

public class leetCodeQ543Memo {

    public static int levels(Node root , HashMap<Node , Integer> dp ){
        if(root == null) return 0 ;
        if(dp.containsKey(root)) return dp.get(root) ;
        int level = 1 + Math.max(levels(root.left , dp ) ,levels(root.right , dp)) ;
        dp.put(root , level) ;
        return level ;
    }
    public static int diameter(Node root , HashMap<Node , Integer> dp) {
        if(root == null) return 0 ;
        int myDia = (levels(root.left , dp ) + levels(root.right , dp));
        int leftDia = diameter(root.left , dp) ;
        int rightDia = diameter(root.right , dp) ;
        return Math.max(myDia , Math.max(leftDia , rightDia)) ;

    }
    public static int diameterOfBinaryTree(Node root) {
        HashMap<Node , Integer> dp = new HashMap<>() ;
        return diameter(root , dp) ;
    }

    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(4) ;
        Node e = new Node( 5) ;

        a.left = b ; a.right = c ;
        b.left = d ; b.right = e ;

        System.out.println(diameterOfBinaryTree(a));
    }
}
