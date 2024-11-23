package Trees;

public class leetCodeQ543MOpt {
    public static int levels(Node root , int[] maxDia){
        if(root == null) return 0 ;
        int leftLevels = levels(root.left , maxDia) ;
        int rightLevels = levels(root.right , maxDia) ;
        int dia = leftLevels + rightLevels ;
        maxDia[0] = Math.max(dia , maxDia[0]) ;
        return 1 + Math.max(leftLevels , rightLevels) ;
    }
    public static int diameterOfBinaryTree(Node root) { 
        int[] maxDia = {0};
        levels(root , maxDia) ;
        return maxDia[0] ;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;     a.right = c;
        b.left = d;     b.right = e;

        System.out.println(diameterOfBinaryTree(a));


    }
}
