package Linked_List;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100) ;
        System.out.println(a.val);
        Node temp = a ; // Shallow Copy 
        // Node temp = new Node(a.val) ; // Deep Copy 
        System.out.println(temp.val); 
        temp.val = 12 ;
        System.out.println(a.val);
        System.out.println(temp.val);
        a.val = 100 ;
        System.out.println(a.val);
        System.out.println(temp.val);
    }
}
