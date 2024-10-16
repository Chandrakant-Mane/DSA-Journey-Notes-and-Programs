package Linked_List;

public class leetCodeQ92 {
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
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // if(head == null || head.next == null || left == right) return head ;
        ListNode a = null , b = null , c = null , d = null ;
        ListNode temp = head ;
        int pos = 1 ;
        while(temp != null){
            if(pos == left-1) a = temp ;
            if(pos == left) b = temp ;
            if(pos == right) c = temp ;
            if(pos == right + 1) d = temp ;
            temp = temp.next ;
            pos++ ;
        }
        if(a != null)a.next = null ;
        c.next = null ;
        reverseList(b) ;
        b.next = d ;
        if(a == null ) return c ;
        a.next = c ;
        return head ;

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
        int left = 2 ;
        int right = 4 ;
        display(a);
        reverseBetween(a , left , right);
        display(a);
        
    }
}
