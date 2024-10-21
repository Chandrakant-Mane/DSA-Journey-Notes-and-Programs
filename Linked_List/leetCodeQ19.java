package Linked_List;

// class ListNode{
//     int val ;
//     ListNode next ;
//     ListNode(int val){
//         this.val = val ;
//     }
// }

public class leetCodeQ19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head ;
        ListNode slow = head ;
        for(int i = 0 ; i < n ; i++ ){
            fast = fast.next ;
        }
        // n == len
        // I have to delete the head 
        if(fast==null) return head.next ;

        while(fast.next !=  null){
            fast = fast.next ;
            slow = slow.next ;
        }
        slow.next = slow.next.next ;
        return head ;
    }
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
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
        display(a);
        ListNode head = removeNthFromEnd(a, 2);
        display(head);

    }
}
