package Trees;

public class leetCodeQ437 {
    public static int helper(Node root , long sum){
        if(root == null) return 0;
        int count = 0 ;
        if(root.val == sum)
            count++  ;
        count += helper(root.left , sum - root.val) + helper(root.right , sum - root.val) ;
        return  count ;
    
    }
    public static int pathSum(Node root, int targetSum) {
        if(root == null) return 0 ;
        return helper(root , targetSum) + pathSum(root.left , targetSum) + pathSum(root.right , targetSum);
    }
    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(5) ;
        Node c = new Node(-3) ;
        Node d = new Node(3) ;
        Node e = new Node(2) ;
        Node f = new Node(11) ;
        Node g = new Node(3) ;
        Node h = new Node(-2) ;
        Node i = new Node(1) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.right = f ;
        d.left = g ;        d.right = h ;
        e.left = i ;

        int targetSum = 8 ;

        System.out.println(pathSum(a, targetSum));

    }
}
