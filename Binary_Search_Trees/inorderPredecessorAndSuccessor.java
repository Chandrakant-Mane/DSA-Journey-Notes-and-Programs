package Binary_Search_Trees;

import java.util.ArrayList;
import java.util.List;

public class inorderPredecessorAndSuccessor {

    public static List<Integer> helper(Node root , List<Integer> ans){
        if(root == null) return ans ;
        helper(root.left, ans) ;
        ans.add(root.val) ;
        helper(root.right, ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        Node a = new Node(50) ;
        Node b = new Node(30) ;
        Node c = new Node(70) ;
        Node d = new Node(20) ;
        Node e = new Node(40) ;
        Node f = new Node(60) ;
        Node g = new Node(80) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.left = f ;        c.right = g ; 

        List<Integer> ans = helper(a , new ArrayList<>()) ;

        System.out.println(ans );
        Node key = a ;

        for(int i = 0 ; i < ans.size() - 1 ; i++ ){
            if(ans.get(i) == key.val){
                System.out.println("Predecessor is : " + ans.get(i-1));
                System.out.println("Successor is : " + ans.get(i+1));
                break ;
            }

        }

    }
}
