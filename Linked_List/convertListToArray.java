package Linked_List ;


public class convertListToArray {

    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        ListNode temp = a ;
    
        display(a);
        int[] arr = new int[5] ;
        int i = 0  ;
        while(temp != null){
            arr[i] = temp.val ;
            i++ ;
            temp = temp.next ;
        }

        System.out.print("arr is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();


        temp = a;
        ListNode[] brr = new ListNode[5] ;
        // brr[0] = temp ;
        int j = 0 ;
        while(temp != null){
            brr[j] = temp ;
            j++ ;
            temp = temp.next ;
        }
        System.out.print("brr is : ");
        // System.out.println(brr[0].val);
        for(ListNode ele : brr){
            System.out.print(ele.val + " ");
        }
        System.out.println();

        arr[0]= 2 ;
        System.out.println("arr[0] is : " + arr[0]);
        System.out.println("a.val is : " + a.val);

        System.out.println();

        brr[0].val = 2 ;
        System.out.println("brr[0] is : " + brr[0].val);
        System.out.println("a.val is : " + a.val);

        

    }
}
