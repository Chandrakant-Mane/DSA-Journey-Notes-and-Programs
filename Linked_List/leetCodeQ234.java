package Linked_List;

public class leetCodeQ234 {
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
        if(head.next == null) return true ;
        // Create a deep copy 
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next ;
        ListNode t2 = newHead ;
        while(t1 != null){
            ListNode temp = new ListNode(t1.val) ;
            t2.next = temp ;
            t2 = t2.next ;
            t1 = t1.next ;
        }
        newHead = reverseList(newHead);
        t1 = head ;
        t2 = newHead ;
        while( t1 != null){
            if(t1.val != t2.val) return false ;
            else{
                t2 = t2.next ;
                t1 = t1.next ;
            }
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
