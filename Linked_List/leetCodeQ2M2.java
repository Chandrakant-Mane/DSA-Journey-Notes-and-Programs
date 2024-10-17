package Linked_List;

public class leetCodeQ2M2 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        if(carry > 0){
            ListNode node = new ListNode(carry) ;
            temp.next = node ;
            temp = temp.next ;
        }
        return dummy.next ;
    }
    public static void main(String[] args) {
        //  List 1 
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(9);
        ListNode g = new ListNode(9);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;
        display(a);

        // List 2 ;
        ListNode l = new ListNode(9);
        ListNode m = new ListNode(9);
        ListNode n = new ListNode(9);
        ListNode o = new ListNode(9);
        l.next = m ;
        m.next = n ;
        n.next = o ;
        display(l);

        ListNode head = addTwoNumbers(a, l);
        display(head);
        
        
    }
}
