package Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ257 {
    public static void helper(Node root , List<String> ans , String str){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            str += root.val ;
            ans.add(str) ;
            return ;
        }
        helper(root.left, ans , str + root.val + "->" ) ;
        helper(root.right , ans , str + root.val + "->" ) ;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(5) ;

        a.left = b ;
        a.right = c ;
        b.right = d ;


        List<String> ans = new ArrayList<>() ;
        helper(a , ans ,"") ;

        System.out.println(ans);
    }
}
