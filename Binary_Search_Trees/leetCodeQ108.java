package Binary_Search_Trees ;

import java.util.LinkedList;
import java.util.Queue;

public class leetCodeQ108 {
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
    public static Node helper(int[] arr , int lo , int hi){
        if(lo > hi) return null ;
        int mid = (lo + hi) / 2 ;
        Node root = new Node(arr[mid]) ;
        root.left = helper(arr , lo , mid-1) ;
        root.right = helper(arr , mid+1 , hi) ;
        return root ;
    }
    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 } ;
        Node root = helper(nums, 0, nums.length - 1); 
        display(root);
    }
}
