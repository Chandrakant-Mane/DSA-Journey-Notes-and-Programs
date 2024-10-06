package Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode node ;
    ListNode head ;
    ListNode(int x) { val = x; }
}

public class leetCodeQ237 {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val ;
        node.next = node.next.next ;    
    }
    public static void display(ListNode a){
        ListNode head = a;
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode node = new ListNode(5);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(9);
        a.next = node ;
        node.next = b;
        b.next = c ;
        deleteNode(node) ;
        display(a) ;

    }
    
}
