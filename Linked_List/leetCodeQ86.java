package Linked_List;

public class leetCodeQ86 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1) ;
        ListNode d2 = new ListNode(-1) ;
        ListNode t1 = d1 ;
        ListNode t2 = d2 ;
        ListNode t = head ;
        while(t != null){
            if(t.val < x){
                t1.next = t ;
                // t = t.next ;
                t1 = t1.next ;
            }
            else{
                t2.next = t ;
                // t = t.next ;
                t2 = t2.next ;
            }
            t = t.next ;
        }
        t2.next = null;
        t1.next = d2.next ;
        return d1.next ;
    }
    public static void reverseLl(ListNode head){
        ListNode temp = head ;
        if(temp == null) return ;
        reverseLl(temp.next);
        System.out.print(temp.val + " ");
    
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        int x = 3 ; 

        reverseLl(a);
        System.out.println();
    
        display(a);
        ListNode head = partition(a , x);
        display(head);
        
    }
}
