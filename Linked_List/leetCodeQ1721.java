package Linked_List;

// class ListNode{
//     int val ;
//     ListNode next ;
//     ListNode(int val){
//         this.val = val ;
//     }
// }

public class leetCodeQ1721 {

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head ;
        ListNode slow = head ;
        ListNode fast1 ;

        for(int i = 1 ; i < k ; i++ ){
            fast = fast.next ;
        }
        fast1 = fast ;

        while(fast.next !=  null){
            fast = fast.next ;
            slow = slow.next ;
        }
        int temp = fast1.val ;
        fast1.val = slow.val ;
        slow.val = temp ;
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
        ListNode head = swapNodes(a ,2 ) ;
        display(head);

    }
    
}
