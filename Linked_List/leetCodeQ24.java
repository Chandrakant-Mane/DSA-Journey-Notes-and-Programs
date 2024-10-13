package Linked_List;

public class leetCodeQ24 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode t1 = head ;
        ListNode L1H = head ;
        ListNode L2H = head.next ;
        ListNode t2 = head.next ;
        while(t1.next != null && t2.next != null){
            t1.next = t2.next ;
            t1 = t1.next ;
            t2.next = t1.next ;
            t2 = t2.next ;
        }
        if(t1 != null) t1.next = null ;
        ListNode dummy = new ListNode(-1) ;
        ListNode d = dummy;
        t1 = L1H ;
        t2 = L2H ;
        while(t2 != null){
            d.next = t2 ;
            t2 = t2.next ;
            d = d.next ;
            d.next = t1 ;
            d = d.next ;
            t1 = t1.next ;
        }
        return dummy.next ;
        
    }
     
    

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        // ListNode e = new ListNode(5) ;
        
        a.next = b ;
        b.next = c ;
        c.next = d ;

        display(a);
        ListNode ansHead = swapPairs(a);
    
        display(ansHead);
    }
}
