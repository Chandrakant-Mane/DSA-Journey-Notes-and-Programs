package DynamicProgramming ;


public class leetCodeQ124 {
    static int maxSum ;
    public static int lineSum(Node root){
        if(root == null ) return 0 ;
        int leftLineSum = lineSum(root.left) ;
        int rightLineSum = lineSum(root.right) ;
        int pathSum = root.val ;
        if(leftLineSum > 0) pathSum += leftLineSum ;
        if(rightLineSum > 0) pathSum += rightLineSum ;
        maxSum = Math.max(maxSum , pathSum) ;
        return root.val + Math.max(0 , Math.max(leftLineSum , rightLineSum)) ;
    }
    public static int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE ;
        lineSum(root) ;
        return maxSum ;
    }
    public static void main(String[] args) {
        Node a = new Node(-10) ;
        Node b = new Node(9) ;
        Node c = new Node(20) ; 
        Node d = new Node(15) ;
        Node e = new Node(7) ;

        a.left = b ;    a.right = c ;
        c.left = d ;    c.right = e ;

        System.out.println(maxPathSum(a));
    }
}
