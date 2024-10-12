package Linked_List;

public class leetCodeQ148 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
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
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head ;
        ListNode firstHalf = head ;
        ListNode slow = head  ;
        ListNode fast = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode secondHalf = slow.next ;
        slow.next = null ;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf) ;

        ListNode ans = merge(firstHalf , secondHalf);
        return ans ;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(30);
        ListNode b = new ListNode(80);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(0);
        ListNode f = new ListNode(5);
        
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;

        display(a);

        ListNode head = sortList(a);
        display(head);
    }
}
