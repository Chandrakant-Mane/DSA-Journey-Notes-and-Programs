package Linked_List;

public class leeCodeQ445 {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy ;
        int carry = 0 ;
        while(l1 != null || l2 != null){
            int val1 = 0 , val2 = 0 ;
            if(l1 != null) val1 = l1.val ;
            if(l2 != null) val2 = l2.val ;
            int num = val1 + val2 + carry ;
            ListNode node = new ListNode(num%10) ;
            temp.next = node ;
            temp = temp.next ;
            if(num > 9) carry = 1 ;
            else carry = 0 ;
            if(l1 != null) l1 = l1.next ;
            if(l2 != null) l2 = l2.next ;
        }
        if(carry == 1){
            ListNode node = new ListNode(carry) ;
            temp.next = node ;
            temp = temp.next ;
        }
        return reverseList(dummy.next);
    }
    public static void main(String[] args) {
        //  List 1 
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        display(a);

        // List 2 ;
        ListNode l = new ListNode(5);
        ListNode m = new ListNode(6);
        ListNode n = new ListNode(4);
        l.next = m ;
        m.next = n ;
        display(l);

        ListNode head = addTwoNumbers(a, l);
        display(head);
        
        
    }
}
