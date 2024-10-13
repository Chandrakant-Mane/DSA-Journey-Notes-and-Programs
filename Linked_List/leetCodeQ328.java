package Linked_List;

public class leetCodeQ328 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1) ;
        ListNode even = new ListNode(-1) ;
        ListNode tempo = odd ;
        ListNode tempe = even ;
        ListNode temp = head;
        while(temp != null){
            tempo.next = temp ;
            temp = temp.next ;
            tempo = tempo.next ;

            tempe.next = temp ;
            if(temp == null) break ;
            temp = temp.next ;
            tempe = tempe.next ;
        }
        // odd = odd.next ;
        even = even.next ;
        tempo.next = even;
        return odd.next ;
        
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5) ;
        
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        display(a);
        ListNode ansHead = oddEvenList(a);
    
        display(ansHead);
    }
}
