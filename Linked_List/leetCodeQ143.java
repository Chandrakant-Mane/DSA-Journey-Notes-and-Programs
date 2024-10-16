package Linked_List;

public class leetCodeQ143 {
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
    public static void reorderList(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode x = slow.next ;
        slow.next = null ;
        x = reverseList(x) ;
        ListNode d1 = new ListNode(-1) ;
        ListNode t = d1 ;
        ListNode t1 = head ;
        ListNode t2 = x ;
        while(t2 != null){
            t.next = t1 ;
            t1 = t1.next ;
            t = t.next ;
            t.next = t2 ;
            t2 = t2.next ;
            t = t.next ;
        }
        t.next = t1 ;

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
        reorderList(a);
        display(a);
        
    }
}
