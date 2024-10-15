package Linked_List;

public class leetCodeQ234M2 {
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
    public static ListNode divideLL(ListNode head){
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++ ;
            temp = temp.next ;
        }
        System.out.println("size is "+ size);
        size = size/2 ;
        temp = head ;
        for(int i = 1 ; i < size ; i++){
            temp = temp.next ;
        }
        ListNode newHead  = reverseList(temp.next);
        temp.next = null ;
        return newHead ;
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
        ListNode newHead = divideLL(a);
        display(newHead);
        display(a);
        ListNode t1 = a  ;
        ListNode t2 = newHead  ;

        boolean flag = true ;
        while(t1 != null){
            if(t1.val != t2.val){
                System.out.println("false");
                flag = false ;
                break ;
            }
            else{
                t1  = t1.next ;
                t2 = t2.next ;
            }
        }
        if(flag == true)
        System.out.println("true");

        // System.out.println(isPalindrome(a));
        // display(head);
        
    }
}
