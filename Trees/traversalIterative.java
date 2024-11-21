package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class traversalIterative {
    public static void preorderIterative(Node root){
        Stack<Node> st = new Stack<>() ;
        st.push(root) ;
        while(st.size() > 0){
            Node temp = st.pop() ;
            System.out.print(temp.val + " ");
            if(temp.right != null) st.push(temp.right) ;
            if(temp.left != null) st.push(temp.left) ;
        }
    }

    public static void inorderIterative(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node temp = root ;
        while (true) {
            if(temp != null){
                st.push(temp) ;
                temp = temp.left ;
            }
            else{
                if(st.size() == 0) break ;
                Node top = st.pop() ;
                ans.add(top.val) ;
                temp = top.right ;
            }
        }
        System.out.print(ans);

    }


    public static void postorderIterative(Node root) {
        List<Integer> ans = new ArrayList<>() ;
        if(root == null) return ;
        Stack<Node> st = new Stack<>() ;
        st.push(root) ;
        while(st.size() > 0){ 
            Node temp = st.pop() ;
            ans.add(temp.val) ;
            if(temp.left != null) st.push(temp.left) ;
            if(temp.right != null) st.push(temp.right) ;
        }
        Collections.reverse(ans) ;
        System.out.println(ans);
        
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

        System.out.print("Preorder : ");
        preorderIterative(a) ;

        System.out.println();
        System.out.print("Inorder : ");
        inorderIterative(a);
        System.out.println();
        System.out.print("Postorder : ");
        postorderIterative(a) ;
    }
}
