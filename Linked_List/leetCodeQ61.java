package Linked_List;

public class leetCodeQ61 {

    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static int lenOfList(ListNode head){
        int len = 0 ;
        ListNode temp = head ;
        while(temp != null){
            len++ ;
            temp = temp.next ;
        }
        return len ;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode slow = head ;
        ListNode fast = head ;
        int len = lenOfList(head) ;
        k = k%len ;
        if(k == 0) return head ;
        for(int i = 0 ; i < k ; i++){
            fast = fast.next ;
        }
        while(fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }
        ListNode slow1 = slow.next;
        slow.next = null;
        fast.next = head ;
        ListNode ansHead = slow1 ;
        return ansHead ;
        
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
        int k = 2 ;

    
        display(a);
        ListNode newHead = rotateRight(a,k);
        
        display(newHead);
    }
}
