package Linked_List;

public class leetCodeQ25 {
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode findKthNode(ListNode temp, int k) {
        for (int i = 1; i < k; i++) {
            if (temp == null)
                return null;
            temp = temp.next;
        }
        return temp;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = head;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode = null;
        ListNode prevNode = null;
        while (temp != null) {
            ListNode kthNode = findKthNode(temp, k);
            if (kthNode == null) {
                if (prevNode != null)
                    prevNode.next = temp;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverseList(temp);
            if (temp == head)
                head = kthNode;
            else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1) ;
        ListNode b = new ListNode(2) ;
        ListNode c = new ListNode(3) ;
        ListNode d = new ListNode(4) ;
        ListNode e = new ListNode(5) ;

        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        display(a);

        ListNode newHead = reverseKGroup(a, 2);

        display(newHead);


    }
}
