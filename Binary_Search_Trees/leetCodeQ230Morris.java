package Binary_Search_Trees;

public class leetCodeQ230Morris {
    public static int kthSmallest(Node root, int k) {
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
                    if(k == 1) return curr.val ;
                    else k-- ;
                    curr = curr.right ;
                    pred.right = null ;
                }
            }
            else{
                if(k == 1) return curr.val ;
                else k-- ;
                curr = curr.right ;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = f;
        int k = 3;

        System.out.println(kthSmallest(a, k));


    }
}
