package Linked_List ;

public class leetCodeQ725 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static int lengthofList(ListNode head ){
        int n = 0 ;
        ListNode temp = head ;
        while(temp != null){
            temp = temp.next ;
            n++ ;
        }
        return n ;
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        int n = lengthofList(head);
        int size = n/k ;  // n/k + 1 ;
        int extra = n%k ;
        ListNode[] ans = new ListNode[k];
        ListNode temp = head ;
        int len = 1 ;
        int idx = 0 ;
        while(temp != null){
            int s = size ;
            if(extra > 0) s++ ;
            if(len == 1){
                ans[idx] = temp ;
                idx++ ;
            }
            if(len == s){
                ListNode a = temp.next ;
                temp.next = null ;
                temp = a ;
                len = 1;
                extra-- ;
            }
            else{
                len++ ;
                temp = temp.next ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b ;
        b.next = c ;
        int k = 5 ;
    
        display(a);
        ListNode[] ans = splitListToParts(a, k);

        for(ListNode ele : ans){
            if(ele != null)
            System.out.print(ele.val + " ");
            else System.out.print(ele + " ");
        }
    }
}
