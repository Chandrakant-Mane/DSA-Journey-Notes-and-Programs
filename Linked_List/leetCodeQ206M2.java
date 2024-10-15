package Linked_List;

public class leetCodeQ206M2 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head ;
        ListNode prev = null ;
        ListNode Next = head ;
        while (curr != null) {
            Next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = Next ;
        }
        return prev ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
    
        display(a);
        ListNode head = reverseList(a) ;
        display(head);
        
    }
}
