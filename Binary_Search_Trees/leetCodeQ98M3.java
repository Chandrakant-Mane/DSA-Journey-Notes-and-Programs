package Binary_Search_Trees;

import java.util.ArrayList;
import java.util.List;

public class leetCodeQ98M3 {

    public static void inorder(Node root , List<Integer> arr){
        if(root == null) return ;
        inorder(root.left , arr) ;
        arr.add(root.val) ;
        inorder(root.right , arr) ;
    }
    public static boolean isValidBST(Node root) {
        List<Integer> arr = new ArrayList<>() ;
        inorder(root , arr) ;
        for(int i = 1 ; i < arr.size() ; i++ ){
            if(arr.get(i) <= arr.get(i-1)) return false ;
        }
        return true ;
        
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(6);

        a.left = b;     a.right = c;
        c.left = d;     c.right = e;

        System.out.println(isValidBST(a));
    }
}
