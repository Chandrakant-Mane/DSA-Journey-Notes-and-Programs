package Trees;


public class leetCodeQ543 {
    public static int levels(Node root){
        if(root == null) return 0 ;
        int level = 1 + Math.max(levels(root.left) ,levels(root.right)) ;
        return level ;
    }
    public static int diameterOfBinaryTree(Node root) {
        if(root == null) return 0 ;
        int myDia = (levels(root.left) + levels(root.right));
        int leftDia = diameterOfBinaryTree(root.left) ;
        int rightDia = diameterOfBinaryTree(root.right) ;
        return Math.max(myDia , Math.max(leftDia , rightDia)) ;


    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(2) ;
        Node c = new Node(3) ;
        Node d = new Node(4) ;
        Node e = new Node(5) ;

        a.left = b ;    a.right = c ;
        b.left = d ;    b.right = e ;

        System.out.println(diameterOfBinaryTree(a));
    }
}
