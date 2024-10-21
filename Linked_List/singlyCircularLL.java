package Linked_List;

class ListNode{
    int val ;
    ListNode next ;
    ListNode(int val){
        this.val = val ;
    }
}

class SimplyCircularLL{
    ListNode head ;
    ListNode tail ;
    int size ;

    void insertAtTail(int val){
        ListNode temp = new ListNode(val) ;
        if(head == null){
            head = tail = temp ;
            tail.next = head ;
        } 
        else{
            tail.next = temp ;
            tail = temp ;
            tail.next = head ;
        }
        size++ ;
    }
    void insertAtHead(int val){
        ListNode temp = new ListNode(val) ;
        if(head == null){
            head = tail = temp ;
            tail.next = head ;
        } 
        else{
            temp.next = head ;
            head = temp ;
            tail.next = head ;
        }
        size++ ;

    }
    void display(){
        ListNode temp = head ;
        while(temp != null){
            System.out.print(temp.val + " ");
            if(temp.next == head) break ;
            temp = temp.next ;
        }
        System.out.println();
    }

    void insert(int idx , int val){
        ListNode x = head ;
        ListNode temp = new ListNode(val);
        if(idx == 0){
            insertAtHead(val) ;
            return ;
        }
        if(idx == size){
            insertAtTail(val) ;
            return ;
        }
        if(idx > size || idx < 0){
            System.out.println("Invalid Index!!");
            return ;
        } 
        for(int i = 1 ; i < idx ; i++){
            x = x.next ;
        }
        // Insertion 
        temp.next = x.next ;
        x.next = temp  ; 
        size++ ;

    }
    int get(int idx) throws Error{
        if(idx >= size || idx < 0){
            // System.out.println("Invalid Index!!");
            throw new Error("BHAI ERROR HAI INDEX MAI!!") ;
        }
        if(idx == size-1){
            return tail.val ;
        }
        if(idx == 0){
            return head.val;
        }
        ListNode temp = head ;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next ;
        }
        return temp.val;
    }
    void set(int idx , int val){
        if(idx >= size || idx < 0){
            // System.out.println("Invalid Index!!");
            throw new Error("BHAI ERROR IN INDEX !!") ;
        }
        if(idx == size-1){
            tail.val = val ;
        }
        if(idx == 0){
            head.val = val ;
        }
        ListNode temp = head ;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next ;
        }
        temp.val = val ;
        System.out.println();
    }

    void deleteAtHead() throws Error{
        if(head == null) throw new Error("Bhai List Khali Hai") ;
        head = head.next ;
        tail.next = head ;
        size-- ;

        System.out.println();
    }
    void deleteAtTail() throws Error{
        if(head == null) throw new Error("Bhai List Khali Hai") ;
        ListNode temp = head ;
        for(int i = 1 ; i < size-1 ; i++){
            temp = temp.next ;
        }
        temp.next = head;
        tail = temp ;
        // tail.next = head ;
        size-- ;

        System.out.println();
    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return ;
        }
        if(idx == size-1){
            deleteAtTail();
            return ;
        }
        if(idx < 0 || idx >= size){
            throw new Error("BHAI INDEX INVALID HAI") ;
        }
        ListNode temp = head ;
        for(int i = 1 ; i < idx ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        size-- ;
        System.out.println();

    }
    void sizemethod(){
        size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++ ;
            if(temp.next == head) break ;
            temp = temp.next ;
        }
        System.out.println("size is "+ size);
    }

}
public class singlyCircularLL {
    public static void main(String[] args) {
        SimplyCircularLL list = new SimplyCircularLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display(); 

        list.insertAtHead(50);
        list.insertAtHead(60);
        list.insertAtHead(70);
        list.display();
        System.out.println(list.tail.next.val);

        list.insert(4, 100);
        list.display();
        System.out.println("Tail is : " + list.tail.val);
        System.out.println("Tail.next is : " + list.tail.next.val);
        System.out.println("Head is : " + list.head.val);
        System.out.println(list.size);

        System.out.println(list.get(5));

        list.set(4, 500);
        list.display();

        list.deleteAtHead();
        list.display();
        System.out.println("Tail is : " + list.tail.val);
        System.out.println("Tail.next is : " + list.tail.next.val);
        System.out.println("Head is : " + list.head.val);
        System.out.println(list.size);

        list.delete(6);
        list.display();

        list.sizemethod() ;
        list.deleteAtTail();
        list.display();



    }
}
