package Linked_List;

public class leetCodeQ234M3 {
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
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode j = reverseList(slow);
        ListNode i = head ;
        while(j != null){
            if(i.val != j.val) return false;
            i = i.next ;
            j = j.next ;
        }
        return true ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b ;
        b.next = c ;
        c.next = d ;
    
        display(a);
        System.out.println(isPalindrome(a));
        // display(head);
        
    }
}
