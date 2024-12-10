package Binary_Search_Trees;

public class leetCodeQ98Morris {
    public static boolean isValidBST(Node root) {
        Node prev = null ;
        Node curr = root ;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left ;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right ;
                }
                if(pred.right == null){
                    pred.right = curr ;
                    curr = curr.left ;
                }
                else{
                    if(prev != null && prev.val >= curr.val) return false ;
                    prev = curr ;
                    curr = curr.right ;
                    pred.right = null ;
                }
            }
            else{
                if(prev != null && prev.val >= curr.val) return false ;
                prev = curr ;
                curr = curr.right ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(6);

        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;

        System.out.println(isValidBST(a));
    }
}
