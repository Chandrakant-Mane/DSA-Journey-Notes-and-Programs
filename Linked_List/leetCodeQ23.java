package Linked_List ;

import java.util.ArrayList;
import java.util.Collections;

public class leetCodeQ23 {
    public static ListNode convertArrToLinkedList(ArrayList<Integer> arr){
        ListNode dummyNode = new ListNode(-1) ;
        ListNode temp = dummyNode ;

        for(int i = 0 ; i < arr.size() ; i++){
            ListNode newNode = new ListNode(arr.get(i)) ;
            temp.next = newNode ;
            temp = temp.next ;
        }

        return dummyNode.next ;

    }
    public static  ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>() ;
        int n = lists.length ;
        for(int i = 0 ; i < n ; i++){
            ListNode temp = lists[i] ;

            while(temp != null){
                arr.add(temp.val) ;
                temp = temp.next ;
            }
        }

        Collections.sort(arr) ;
        ListNode newHead = convertArrToLinkedList(arr) ;

        return newHead ;

    }
    
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1) ;
        ListNode b = new ListNode(4) ;
        ListNode c = new ListNode(5) ;
        a.next = b ;
        b.next = c ;

        ListNode x = new ListNode(1) ;
        ListNode y = new ListNode(3) ;
        ListNode z = new ListNode(4) ;
        x.next = y ;
        y.next = z ;

        ListNode l = new ListNode(2) ;
        ListNode m = new ListNode(6) ;
        l.next = m ;

        ListNode[] lists = {a , x , l} ;

        for(int i = 0 ; i < lists.length ; i++){
            ListNode temp = lists[i] ;
            while(temp != null){
                System.out.print(temp.val + " "); 
                temp = temp.next ;
            }
            System.out.println();
        }

        ListNode head = mergeKLists(lists) ;

        display(head);

    }
}
