package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetCodeQ144 {
    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>() ;
        if(root == null) return ans ;
        Stack<Node> st = new Stack<>() ;
        st.push(root) ;
        while(st.size() > 0){ 
            Node temp = st.pop() ;
            ans.add(temp.val) ;
            if(temp.right != null) st.push(temp.right) ;
            if(temp.left != null) st.push(temp.left) ;
        }
        return ans ;
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;     a.right = c;
        b.left = d;     b.right = e;
        c.left = f;     c.right = g;
        e.left = h;     f.right = i;

        System.out.println(preorderTraversal(a));

    }
}
