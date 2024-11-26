package Binary_Search_Trees;

import java.util.Stack;

public class leetCodeQ230 {
    public static int kthSmallest(Node root, int k) {
        Stack<Node> st = new Stack<>() ;
        Node temp = root ;
        while(true){
            if(temp != null){
                st.push(temp) ;
                temp = temp.left ;
            }
            else{
                if(st.size() == 0 ) break ;
                Node top = st.pop() ;
                if(k == 1) return top.val ;
                else k-- ;
                temp = top.right ;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        Node a = new Node(5) ;
        Node b = new Node(3) ;
        Node c = new Node(6) ;
        Node d = new Node(2) ;
        Node e = new Node(4) ;
        Node f = new Node(1) ;

        a.left = b ;        a.right = c ;
        b.left = d ;        b.right = e ;
        d.left = f ;

        System.out.println(kthSmallest(a, 3));

    } 
}
