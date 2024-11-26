package Binary_Search_Trees;

import java.util.ArrayList;
import java.util.List;


public class leetCodeQ230M2 {
    public static List<Integer> helper(Node root , int k , List<Integer> ans ){
        if(root == null) return ans ;
        helper(root.left , k , ans) ;
        ans.add(root.val) ;
        helper(root.right , k , ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(1);

        a.left = b;     a.right = c;
        b.left = d;     b.right = e;
        d.left = f;
        int k = 3 ;
        List<Integer> ans = helper(a , k , new ArrayList<>() ) ;

        System.out.println(ans);
        System.out.println(ans.get(k-1));

    }
}
