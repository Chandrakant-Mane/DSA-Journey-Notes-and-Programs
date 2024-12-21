package Heaps;

public class checkBinaryTIsMaxHeap {
    static class  Node{
        int val ;
        Node left ;
        Node right ;
        Node(int val){
            this.val = val ;
        }
    }

    public static boolean isHeap(Node root){
        if(root == null) return true;
        if(root.left != null && root.left.val > root.val) return false ;
        if(root.right != null && root.right.val > root.val) return false ;
        return isHeap(root.left) && isHeap(root.right) ;
    }

    public static boolean isCBT(Node root , int i , Integer n){
        if(root == null) return true ;
        if(i >= n) return false ;
        return isCBT(root.left, 2*i+1, n) && isCBT(root.right, 2*i+2, n) ;
    }

    public static boolean isMaxHeap(Node root){
        int size = size(root) ;
        return isHeap(root) && isCBT(root , 0 , size);
    }
    public static int size(Node root){
        if(root == null) return 0 ;
        return 1 + size(root.left) + size(root.right) ;
    }
    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(8) ;
        Node c = new Node(7) ;
        Node d = new Node(6) ;
        Node e = new Node(4) ;

        a.left = b ;    a.right = c ;
        b.left = d ;    b.right = e ;

        System.out.println(isMaxHeap(a));
    }
}
