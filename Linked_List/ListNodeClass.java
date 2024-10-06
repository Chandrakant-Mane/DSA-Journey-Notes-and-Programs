package Linked_List;

class Node{
    int val ;
    Node next ;
    Node(int val){
        this.val = val ;
    }
}

public class ListNodeClass {
    // public static void print(Node head){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.println(temp.val);
    //         temp = temp.next ;
    //     }
    // }

        // Home Work 
    public static void print(Node head){
        // Node temp = head;
        if(head == null)  return ;
        System.out.println(head.val);
        print(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        // a.next = b ;   // Linking = >   a -->  b
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b ;   // 10 -> 20
        b.next = c ;   // 10 -> 20 -> 30 
        c.next = d ;   // 10 -> 20 -> 30 -> 40 
        d.next = e ;   // 10 -> 20 -> 30 -> 40 -> 50 
        e.next = f ;

        print(a);

        // Node temp = a;
        // while(temp != null){
        //     System.out.println(temp.val);
        //     temp = temp.next ;
        // }

        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        // System.out.println(a.next.next.next.val);
        // System.out.println(a.next.next.next.next.val);
        
    }
    
}
