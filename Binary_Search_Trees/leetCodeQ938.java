package Binary_Search_Trees;

public class leetCodeQ938 {
    public static int rangeSumBST(Node root, int low, int high) {
        if(root == null) return 0 ;
        int sum = 0 ;
        if(root.val > low) 
            sum += rangeSumBST(root.left , low , high) ;
        if(root.val < high) 
            sum += rangeSumBST(root.right , low , high) ;
        if(root.val <= high && root.val >= low) sum += root.val ;
        return sum ;
    }
    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(5) ;
        Node c = new Node(15) ;
        Node d = new Node(3) ;
        Node e = new Node(7) ;
        Node f = new Node(18) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f ;

        System.out.println(rangeSumBST(a, 7, 15));
    }
}
