package Linked_List;
class dNode{
    int val ;
    dNode next ;
    dNode prev ;
    dNode(int val){
        this.val = val ;
    }
}

class DLL{
    dNode head ;
    dNode tail ;
    int size ;
    void display(){
        dNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; 
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val) ;
        if(size == 0) head = tail = temp ;
        else{
            tail.next = temp ;
            temp.prev = tail ; // Extra 
            tail = temp;
        }
        size++ ;
        
    }

    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp ;
        else{
            temp.next = head ;
            head.prev = temp ;
            head = temp ;
        }
        size++ ;
    }

    void insert(int idx , int val){
        dNode x = head ;
        dNode temp = new dNode(val);
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
        dNode y = x.next ;
        x.next = temp  ;   temp.prev = x ;
        y.prev = temp ;    temp.next = y ;
        size++ ;

    }
    void deleteAtHead() throws Error{
        if(head == null) throw new Error("List is Empty");
        head = head.next ;
        head.prev = null ; // extra 
        size-- ;
    }

    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("List is Empty");
        tail = tail.prev ;
        tail.next = null ;
        size-- ;
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
        dNode temp = head ;
        for(int i = 1 ; i < idx ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        temp = temp.next ;    //  Extra  
        temp.prev = temp.prev.prev ;   // Extra 
        size-- ;
        System.out.println();

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
            return head.val ;
        }
        dNode temp = head ;
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
        dNode temp = head ;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next ;
        }
        temp.val = val ;
        System.out.println();
    }
}
public class doublyLinkedListimplementation {
    public static void print(dNode head){
        dNode temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void printreverse(dNode tail){
        dNode temp = tail ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node ;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // Now temp is at head 
        print(temp);
        // while(temp != null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next ;
        // }
        
        // System.out.println();
    }

    public static void main(String[] args) {
        // dNode a = new dNode(10);
        // dNode b = new dNode(20);
        // dNode c = new dNode(30);
        // dNode d = new dNode(40);
        // a.next = b ; b.prev = a ;
        // b.next = c ; c.prev = b ;
        // c.next = d ; d.prev = c ;

        // print(a) ;
        // printreverse(d);
        // display(c);

        //   Insert At Tail 
        DLL list = new DLL();
        list.display(); 
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display(); 
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);

        //   Insert At Head 

        list.insertAtHead(50);
        list.insertAtHead(60);
        list.insertAtHead(70);
        list.display();
        System.out.println(list.head.val);
        System.out.println(list.size);

        //  Insert At Anu Position 

        list.insert(3, 100);
        list.display();

        // Delete 

        list.delete(4);
        list.display();

        // Get 
        System.out.println(list.get(2));
        System.out.println(list.size);

        // Set 
        list.set(4, 0);
        list.display();
    }
}
