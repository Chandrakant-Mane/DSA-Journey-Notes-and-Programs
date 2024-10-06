package Linked_List;

class SimplyLL{
    private Node head ;
    Node tail ;
    int size ;

    void insertAtTail(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            tail.next = temp ;
            tail = temp ;
        }
        size++ ;
    }

    void insertAtHead(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            temp.next = head ;
            head = temp ;
        }
        size++ ;
        System.out.println();

    }

    void insert(int idx , int val){
        Node x = head ;
        Node temp = new Node(val);
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
        Node temp = head ;
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
        Node temp = head ;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next ;
        }
        temp.val = val ;
        System.out.println();
    }

    void deleteAtHead() throws Error{
        if(head == null) throw new Error("Bhai List Khali Hai") ;
        head = head.next ;
        size-- ;

        System.out.println();
    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return ;
        }
        if(idx < 0 || idx >= size){
            throw new Error("BHAI INDEX INVALID HAI") ;
        }
        Node temp = head ;
        for(int i = 1 ; i < idx ; i++){
            temp = temp.next ;
        }
        if(temp.next == tail){
            tail = temp ;
        }
        temp.next = temp.next.next ;
        size-- ;
        System.out.println();

    }

    void display(){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    void sizemethod(){
        size = 0;
        Node temp = head;
        while (temp != null) {
            size++ ;
            temp = temp.next ;
        }
        System.out.println("size is "+ size);
    }
}

public class Implementation {
    public static void main(String[] args) {
        SimplyLL list = new SimplyLL() ;
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        // System.out.println(list.size);
        list.sizemethod();

        System.out.println();
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.display(); 
        System.out.println(list.size);
        list.sizemethod();

        list.insertAtHead(70) ;
        list.display(); 
        list.sizemethod();
        list.insertAtHead(80);
        list.display(); 
        list.sizemethod();  
        System.out.println(list.size); 

        list.insert(0, 100);
        list.display(); 
        list.insert(1, 200);
        list.display();

        list.insert(1, 300);
        list.display();

        System.out.println("get" + list.get(10));

        list.set(2,90) ;
        list.display();

        System.out.println("Delete starts");

        list.deleteAtHead();
        list.display();
        list.sizemethod(); 

        list.delete(5);
        list.display(); 
        list.sizemethod(); 

        list.delete(8);
        list.display(); 
        list.sizemethod(); 
        System.out.println(list.tail.val);
    }
}
