package Linked_List;

public class leetCodeQ206 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head ;
        ListNode t = head ;
        ListNode t1 = head.next ;
        ListNode t2 = t1.next ;
        t.next = null ;
        while(t2 != null){
            t1.next = t ;
            t = t1 ;
            t1 = t2 ;
            t2 = t2.next ;
        }
        t1.next = t ;
        return t1 ;
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
