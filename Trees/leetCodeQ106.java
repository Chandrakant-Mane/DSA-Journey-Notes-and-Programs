package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ106 {
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

    public static Node helper(int[] inorder, int[] postorder , int inlo , int inhi , int postlo , int posthi ){
        if(inlo > inhi || postlo > posthi) return null ;
        Node root = new Node(postorder[posthi]) ;
        int r = 0 ;
        while(inorder[r] != postorder[posthi] ){
            r++ ;
        }
        int leftsize = r - inlo ;
        root.left = helper(inorder , postorder , inlo , r-1 , postlo , leftsize+postlo-1) ;
        root.right = helper(inorder , postorder , r+1 , inhi  , leftsize+postlo , posthi-1) ;
        return root ;
    }
    public static Node buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length ;
        return helper(inorder , postorder , 0 , n-1 , 0 , n-1) ;
    }

    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7} ;
        int[] postorder = { 9, 15, 7, 20, 3} ;

        Node root = buildTree(inorder, postorder) ;

        display(root);

    }
}
