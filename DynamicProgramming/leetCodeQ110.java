package DynamicProgramming;

import java.util.HashMap;

public class leetCodeQ110 {
    static HashMap<Node , Integer> dp = new HashMap<>() ;
    public static int lvl(Node root){
        if(root == null) return 0 ;
        if(dp.containsKey(root)){
            return dp.get(root) ; 
        }
        int level = 1 + Math.max(lvl(root.right) , lvl(root.left)) ; 
        dp.put(root , level) ;
        return level ;
    }
    public static boolean isBalanced(Node root) {
        if(root == null) return true ;
        int diff = Math.abs(lvl(root.left) - lvl(root.right)) ;
        if(diff > 1) return false ;

        return isBalanced(root.left) && isBalanced(root.right)  ;
    }
    public static void main(String[] args) {
        Node a = new Node(3) ;
        Node b = new Node(9) ;
        Node c = new Node(20) ;
        Node d = new Node(15) ;
        Node e = new Node(7) ;

        a.left = b ;    a.right = c ;
        b.left = d ;    b.right = e ;

        System.out.println(isBalanced(a));
    }
}
