package Linked_List ;

public class leetCodeQ2 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1) ;
        ListNode t = newList ;
        ListNode t1 = l1 ;
        ListNode t2 = l2 ;
        int x = 0 ;
        int carry = 0 ;
        while(t2 != null && t1 != null){
            x = t1.val + t2.val + carry ;
            ListNode temp = new ListNode(-1);
            if(x < 10){
                temp.val = x ;
                carry = 0 ;
            }
            else{
                temp.val = x%10 ;
                carry = x/10 ;
            }
            t.next = temp ;
            t = t.next ;
            t1 = t1.next ;
            t2 = t2.next ;
        }
        while(t1 != null){
            ListNode temp = new ListNode(-1);
            x = t1.val + carry ;
            if(x < 10){
                temp.val = x ;
                carry = 0 ;
            }
            else{
                temp.val = x%10 ;
                carry = x/10 ;
            }
            t.next = temp ;
            t = t.next ;
            t1 = t1.next ;
        }
        while(t2 != null){
            ListNode temp = new ListNode(-1);
            x = t2.val + carry ;
            if(x < 10){
                temp.val = x ;
                carry = 0 ;
            }
            else{
                temp.val = x%10 ;
                carry = x/10 ;
            }
            t.next = temp ;
            t = t.next ;
            t2 = t2.next ;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            t.next = temp ;
            t = t.next ;
        }
        return newList.next ;

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
