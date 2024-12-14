package Hashmaps;

import java.util.HashMap;

public class leetCodeQ138 {
    static class Node{
        int val ;
        Node next  ;
        Node random ;

        Node(int val){
            this.val = val ;
        }
    }
    public static Node deepCopy(Node head , HashMap<Node , Node> map){
        Node head2 = new Node(head.val);
        Node t1 = head.next ;
        Node t2 = head2 ;
        map.put(head , t2) ;
        while(t1 != null){
            Node temp = new Node (t1.val);
            t2.next = temp ;
            t2 = t2.next ;
            map.put(t1 , t2) ;
            t1 = t1.next ;
        }
        return head2;
    }
    
    public static Node copyRandomList(Node head) {
        if (head == null)
            return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node head2 = deepCopy(head, map);
        // Node temp = head;
        for (Node key : map.keySet()) {
            Node dTemp = map.get(key);
            dTemp.random = map.get(key.random);
        }
        return head2;
    }
    
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printRandom(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.random == null)
                System.out.print("null ");
            else
                System.out.print(temp.random.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        Node newHead = copyRandomList(a) ;

        display(newHead);
        printRandom(newHead);
        
    }
}
