package Linked_List;

public class leetCodeQ83 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode i = head ;
        ListNode j = head ;
        if(head == null) return null;
        while(j != null){
            if(i.val == j.val){
                j = j.next ;
            }
            else{
                i.next = j ;
                i = j ;
            }
        }
        i.next = j ;
        return head ;

    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

    
        display(a);
        ListNode head = deleteDuplicates(a);
        display(head);
        
    }
}
