package Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ113 {
    public static void helper(Node root , int targetSum , List<Integer> arr , List<List<Integer>> ans ){
        if(root == null) return ;
        arr.add(root.val) ;
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            ans.add(arr) ;
        }
        helper(root.left , targetSum - root.val , new ArrayList<>(arr) , ans ) ;
        helper(root.right , targetSum - root.val , new ArrayList<>(arr) , ans ) ;

    }
    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>() ;
        helper(root , targetSum , new ArrayList<>() , ans) ;
        return ans ;
    }

    public static void main(String[] args) {
        Node a = new Node(5) ;
        Node b = new Node(4) ;
        Node c = new Node(8) ;
        Node d = new Node(11) ;
        Node e = new Node(13) ;
        Node f = new Node(4) ;
        Node g = new Node(7) ;
        Node h = new Node(2) ;
        Node i = new Node(5) ;
        Node j = new Node(1) ;

        a.left = b ;        a.right = c ;
        b.left = d ;       
        c.left = e ;        c.right = f ;
        d.left = g ;        d.right = h ;
        f.left = i ;        f.right = j ;

        System.out.println(pathSum(a, 22));
    }
}
