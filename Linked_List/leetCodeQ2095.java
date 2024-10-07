package Linked_List;

public class leetCodeQ2095 {
    public static int deleteMiddle(Node head) {
        Node slow = head ;
        // if(head.next == null) return null ;
        Node fast = head.next ;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next; 
            slow = slow.next ;
        }
        slow.next = slow.next.next ;
        return head.val ;
    }

    public static void display(Node head){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        
        display(a);
        System.out.println(deleteMiddle(a));
        display(a);



    }
}
