package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class leetCodeQ102 {
    public static int levels(Node root){
        if(root == null){
            return 0 ;
        }
        int level = 1 + Math.max(levels(root.left) , levels(root.right)) ;
        return level ;
    }
    public static class Pair{
        Node node ;
        int level ;
        Pair(Node node , int level){
            this.node = node ;
            this.level = level ;
        }
    }
    public static void helper(Node root , List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>() ;
        if(root != null) q.add(new Pair(root,0)) ;
        while(q.size() > 0){
            Pair front = q.remove() ;
            Node temp = front.node ;
            int lvl = front.level;
            ans.get(lvl).add(temp.val) ;
            if(temp.left != null) q.add(new Pair(temp.left , lvl +1)) ;
            if(temp.right != null) q.add(new Pair(temp.right , lvl +1)) ;
        }

    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>() ;
        int lvl = levels(root) ;
        
        for(int i = 0 ; i < lvl ; i++){
            List<Integer> arr = new ArrayList<>() ;
            ans.add(arr) ;
        }

        helper(root , ans) ;

        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(3) ;
        Node b = new Node(9) ;
        Node c = new Node(20) ;
        Node d = new Node(15) ;
        Node e = new Node(7) ;

        a.left = b ;    a.right = c ;
        c.left = d ;    c.right = e ;

        List<List<Integer>> ans = levelOrder(a) ;
        System.out.println(ans);

    }
}
