package Binary_Search_Trees;

public class inorderPredecessorAndSuccessorM2 {
    static Node prev  ;
    static Node pred ;
    static Node succ ;
    public static void helper(Node root , Node key){
        if(root == null) return ;
        helper(root.left , key);
        if(root == key){
            if (prev != null ){
                System.out.println("Predecessor is : " +  prev.val);
                pred = prev ;
            }
        }
        if(prev == key){
            if(root != null){
                System.out.println("Successor is : "  + root.val);
                succ = root ;
            }
        }
        prev = root;
        helper(root.right , key);
        
    }
    public static void main(String[] args) {
        Node a = new Node(50) ;
        Node b = new Node(30) ;
        Node c = new Node(70) ;
        Node d = new Node(20) ;
        Node e = new Node(40) ;
        Node f = new Node(60) ;
        Node g = new Node(80) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        c.left = f ;        c.right = g ; 


        prev = null ;
        Node key = c ;
        pred = null ;
        succ = null ;

        helper(a , key);
        if(pred != null)
        System.out.println(pred.val);
        else System.out.println(pred);
        if(succ != null)
        System.out.println(succ.val);
        else System.out.println(succ);
    }

}
