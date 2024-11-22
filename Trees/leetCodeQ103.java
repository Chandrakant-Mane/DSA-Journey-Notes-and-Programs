package Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ103 {
    public static int levels(Node root){
        if(root == null){
            return 0 ;
        }
        int level = 1 + Math.max(levels(root.left) , levels(root.right)) ;
        return level ;
    }
    public static void nThLevel(Node root , int level , int lvl , List<Integer> arr){
        if(root == null) return ;
        if(level == lvl){
            arr.add(root.val) ;
            return ;
        }
        if(lvl%2 == 0){
            nThLevel(root.left , level+1 , lvl , arr) ;
            nThLevel(root.right , level+1 , lvl , arr) ;
        }
        else{
            nThLevel(root.right , level+1 , lvl , arr) ;
            nThLevel(root.left , level+1 , lvl , arr) ;
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>() ;
        int lvl = levels(root) ;
        for(int i = 0 ; i < lvl ; i++){
            List<Integer> arr = new ArrayList<>() ;
            nThLevel(root , 0 , i , arr ) ;
            ans.add(arr) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(9);
        Node c = new Node(20);
        Node d = new Node(15);
        Node e = new Node(7);

        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;

        System.out.println(zigzagLevelOrder(a));


    }
}
