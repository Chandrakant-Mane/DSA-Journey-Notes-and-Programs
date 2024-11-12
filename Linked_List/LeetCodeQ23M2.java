package Linked_List;

public class LeetCodeQ23M2 {
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode t = dummy;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                t.next = t1;
                // t = t.next ;
                t1 = t1.next;
            } else {
                t.next = t2;
                // t = t.next ;
                t2 = t2.next;
            }
            t = t.next;
        }
        if (t1 == null)
            t.next = t2;
        else
            t.next = t1;
        return dummy.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = mergeTwoLists(head, lists[i]);
        }

        return head;

    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(5);
        a.next = b;
        b.next = c;

        ListNode x = new ListNode(1);
        ListNode y = new ListNode(3);
        ListNode z = new ListNode(4);
        x.next = y;
        y.next = z;

        ListNode l = new ListNode(2);
        ListNode m = new ListNode(6);
        l.next = m;

        ListNode[] lists = { a, x, l };

        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        ListNode head = mergeKLists(lists);

        display(head);
    }
}
