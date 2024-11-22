package Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ199 {
    public static int lvl(Node root){
        if(root == null) return 0 ;
        return 1 + Math.max(lvl(root.right) , lvl(root.left)) ; 
    }
    public static void dfs( Node root , int level ,List<Integer> ans ){
        if(root == null) return ;
        dfs(root.left , level + 1 , ans) ;
        dfs(root.right , level + 1 , ans) ;
        ans.set(level , root.val);
    }
    public static List<Integer> rightSideView(Node root) {
        int n = lvl(root) ;
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            ans.add(0) ;
        }
        dfs(root, 0 , ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(5) ;
        Node e = new Node(4) ;

        a.left = b ;    a.right = c ;
        b.right = d ;   c.right = e ;

        System.out.println(rightSideView(a));


    }
}
