package Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ94Morris {
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>() ;
        Node curr = root ;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left ;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right ;
                }
                if(pred.right == null){
                    pred.right = curr ;
                    curr = curr.left ;
                }
                else{
                    ans.add(curr.val) ;
                    curr = curr.right ;
                    pred.right = null ;
                }
            }
            else{
                ans.add(curr.val) ;
                curr = curr.right ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(4) ;
        Node e = new Node(5) ;
        Node f = new Node(8) ;
        Node g = new Node(6) ;
        Node h = new Node(7) ;
        Node i = new Node(9) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f ;
        e.left = g ;        e.right = h ;
        f.left = i ;

        System.out.println(inorderTraversal(a));


    }
}
