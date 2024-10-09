package Linked_List ;

class ListNode {
    int val;
    ListNode next;
    // ListNode head ;
    ListNode(int x) { val = x; }

}

public class leetCodeQ160 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static int sizemethod(ListNode head){
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++ ;
            temp = temp.next ;
        }
        return size ;
    }
    public static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Calculate Size of Lis1 And List2
        int sizeofList1 = sizemethod(headA);
        int sizeofList2 = sizemethod(headB);
        ListNode List1 = headA ;
        ListNode List2 = headB ;
        if(sizeofList1 > sizeofList2){
            for(int i = 0 ; i < sizeofList1-sizeofList2 ; i++){
                List1 = List1.next ;
            }
        }
        else if(sizeofList1 < sizeofList2){
            for(int i = 0 ; i < sizeofList2-sizeofList1 ; i++){
                List2 = List2.next ;
            }
        }

        while(List1 != null){
            if(List1 == List2) return List1 ;
            List1 = List1.next ;
            List2 = List2.next ;
        }
        return null ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        ListNode h = new ListNode(1);
        f.next = g ;
        g.next = h ;
        h.next = c ;

        display(a);
        display(f);
        ListNode ans = getIntersectionNode(a , f);
        System.out.println(ans.val);
        
        // display();
    }
}
