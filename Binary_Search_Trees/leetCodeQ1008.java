package Binary_Search_Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ1008 {
    public static Node helper(int[] preorder , int[] inorder , int prelo , int prehi , int inlo , int inhi){
        if(prelo > prehi || inlo > inhi) return null; 
        Node root = new Node(preorder[prelo]) ;
        int r = 0 ; 
        while(inorder[r] != preorder[prelo])    r++ ;
        int leftsize = r - inlo ;
        root.left = helper(preorder , inorder , prelo+1 , prelo+leftsize , inlo , r-1) ;
        root.right = helper(preorder , inorder , prelo+leftsize+1 , prehi , r+1 , inhi) ;
        return root ;
    }
    public static Node bstFromPreorder(int[] preorder) {
        int n = preorder.length ;
        int[] inorder = Arrays.copyOf(preorder , n) ;
        Arrays.sort(inorder) ;
        return helper(preorder , inorder , 0 , n-1 , 0 , n-1) ;

    }
    public static void display(Node root){
        Queue<Node> q = new LinkedList<>() ;
        if(root != null)    q.add(root) ;
        while (q.size() > 0) {
            Node front = q.remove() ;
            System.out.print(front.val + " ");  
            if(front.left != null)  q.add(front.left) ;
            if(front.right != null) q.add(front.right) ;
        }
    }
    public static void main(String[] args) {
        int[] preorder = { 8, 5, 1, 7, 10, 12} ;
        Node root = bstFromPreorder(preorder) ;

        display(root);
        
    }
}
