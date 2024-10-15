package Linked_List;

public class leetCodeQ2130 {
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
    public static int pairSum(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode j = reverseList(slow);
        ListNode i = head ;
        int mx = Integer.MIN_VALUE ;
        while(j != null){
            int sum = i.val + j.val ;
            mx = Math.max(sum,mx) ;
            i = i.next ;
            j = j.next ;
        }
        return mx ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b ;
        b.next = c ;
        c.next = d ;
    
        display(a);
        System.out.println(pairSum(a));
        // display(head);
        
    }
}
