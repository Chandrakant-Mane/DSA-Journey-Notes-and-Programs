package Linked_List;

public class leetCodeQ82 {
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int val = curr.val;
                while (curr != null && curr.val == val) {
                    curr = curr.next;
                }
                if (prev != null) {
                    prev.next = curr;
                } else {
                    head = curr;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);

        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;

        ListNode head = deleteDuplicates(a) ;

        display(head);



    }
}
