package Linked_List;

public class leetCodeQ21 {

    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = list1 ;
        ListNode t2 = list2 ;
        ListNode t = dummy ;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                // t = t.next ;
                t1 = t1.next ;
            }
            else{
                t.next = t2 ;
                // t = t.next ;
                t2 = t2.next; 
            }
            t = t.next ;
        }
        if(t1 == null) t.next = t2 ;
        else t.next = t1 ;
        return dummy.next;
    }

    public static void main(String[] args) {
        //  List 1 
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(40);
        ListNode d = new ListNode(60);
        a.next = b ;
        b.next = c ;
        c.next = d ;

        display(a);
        
        ListNode l = new ListNode(20);
        ListNode m = new ListNode(50);
        ListNode n = new ListNode(70);
        ListNode o = new ListNode(75);
        ListNode p = new ListNode(80);
        l.next = m ;
        m.next = n ;
        n.next = o ;
        o.next = p ;
    
        display(l);

        ListNode head = mergeTwoLists(a , l );
        display(head);
    }
    
}
