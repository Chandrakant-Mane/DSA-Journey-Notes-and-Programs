package Linked_List;

public class leetCodeQ142 {

    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static int detectCycle(ListNode head) {
        if(head == null || head.next == null) return 0;
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next!= null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(fast == slow ) break ;
        }
        if(fast != slow) return 0 ;
        ListNode temp = head ;
        while(temp != slow){
            slow = slow.next ;
            temp = temp.next ;
        }
        return slow.val ;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = b ;

        // display(a);
        System.out.println(detectCycle(a));

    
        // display();
    }
}
