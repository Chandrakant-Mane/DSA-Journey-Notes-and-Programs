package Linked_List;

// class ListNode {
//     int val;
//     ListNode next;
//     // ListNode head ;
//     ListNode(int x) { val = x; }

// }

class Solution{
    ListNode head ;
    ListNode tail ;
    ListNode node ;
    void insertAtTail(int val){
        ListNode temp = new ListNode(val) ;
        if(temp.val == 5) node = temp ;
        if(head == null) head = tail = temp ;
        else{
            tail.next = temp ;
            tail = temp ;
        }
    }
    void display(){
        ListNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    void deleteNode() {
        node.val = node.next.val ;
        node.next = node.next.next ;    
    }
}

public class leetCodeQ237 {
    public static void main(String[] args) {
        Solution list = new Solution();
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(1);
        list.insertAtTail(9);

        list.display(); 
        list.deleteNode();
        list.display();

    }
    
}
