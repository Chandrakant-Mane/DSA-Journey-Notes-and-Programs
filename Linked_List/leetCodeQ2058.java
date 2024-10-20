package Linked_List;

public class leetCodeQ2058 {
    public static void display(ListNode head){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head ;
        ListNode mid = head.next ;
        ListNode right = head.next.next ;
        int first = -1 , last = -1 ;
        int idx = 1 ;
        int[] ans = {-1,-1};
        int minDistance = Integer.MAX_VALUE ;
        while(right != null){
            if(mid.val < left.val && mid.val < right.val || mid.val > left.val && mid.val > right.val ){
                if(first == -1) first = idx ;
                if(last != -1){
                    int dist = idx - last ;
                    minDistance = Math.min(minDistance,dist);
                }
                last = idx ;
            }
            idx++ ;
            left = left.next ;
            mid = mid.next ;
            right = right.next ;
        }
        if(first == last) return ans ;
        int maxDistance = last - first ;
        ans[0] = minDistance ;
        ans[1] = maxDistance ;
        return ans ;
    }
     public static void main(String[] args) {
        //  List 1 
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(1);
        ListNode g = new ListNode(2);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;
        display(a);
        
        int[] ans = nodesBetweenCriticalPoints(a);

        for(int ele : ans){
            System.out.print(ele + " ");
        }
        
        
    }
}
