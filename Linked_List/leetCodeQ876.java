package Linked_List;

// class Node{
//     int val ;
//     Node next ;
//     Node(int val){
//         this.val = val ;
//     }
// }

public class leetCodeQ876 {
    public static int middleNode(Node head) {
        Node slow = head ; 
        Node fast = head ;
        while(fast != null  &&  fast.next != null){
            // if(fast.next.next == null) return slow.val ; // if Left middle is asked ;
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        return slow.val ;
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
        Node f = new Node(6);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        display(a);
        System.out.println( middleNode(a));

        e.next = f ;
        display(a);
        System.out.println( middleNode(a));  // right mid;
        


    }
}
