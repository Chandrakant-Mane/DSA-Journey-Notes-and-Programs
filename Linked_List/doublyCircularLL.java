package Linked_List;

// class dNode{
//     int val ;
//     dNode next ;
//     dNode prev ;
//     dNode(int val){
//         this.val = val ;
//     }
// }

class DCLL{
    dNode head ;
    dNode tail ;
    int size ;
    void display(){
        dNode temp = head ;
        while(temp != null){
            System.out.print(temp.val + " ");
            if(temp.next == head) break ;
            temp = temp.next ;
        }
        System.out.println();
    }
    void reverseDisplay(){
        dNode temp = tail ;
        while(true){
            System.out.print(temp.val + " ");
            if(temp.prev == tail) break ;
            temp = temp.prev ;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val) ;
        if(size == 0){
            head = tail = temp ;
            tail.next = head ;
            head.prev = tail ;
        } 
        else{
            tail.next = temp ;
            temp.prev = tail ; // Extra 
            tail = temp;
            tail.next = head ;
            head.prev = tail ;
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
            head.prev = tail ;
            tail.next = head ;
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
        head.prev = tail ; // extra 
        tail.next = head ;
        size-- ;
    }

    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("List is Empty");
        tail = tail.prev ;
        tail.next = head ;
        head.prev = tail ;
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
    }

    void sizemethod(){
        size = 0;
        dNode temp = head;
        while (temp != null) {
            size++ ;
            if(temp.next == head) break ;
            temp = temp.next ;
        }
        System.out.println("size is "+ size);
    }

}

public class doublyCircularLL {
    public static void main(String[] args){
        DCLL list = new DCLL() ;
        System.out.println("Insert At Tail");
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display() ;
        list.reverseDisplay();

        System.out.println("\n Insert At Head");
        list.insertAtHead(50);
        list.insertAtHead(60);
        list.insertAtHead(70);
        list.display();
        list.reverseDisplay();
        System.out.println();
        System.out.println(list.tail.next.val);
        System.out.println(list.head.prev.val);
     
        System.out.println("\nInsert At Any Index");
        list.insert(3, 100);
        list.display();
        list.reverseDisplay();
     
        System.out.println("\nDelete At Head");
        list.deleteAtHead();
        list.display();
        list.reverseDisplay();
        
        System.out.println("\nDelete At Tail");
        list.deleteAtTail();
        list.display();
        list.reverseDisplay();
       
        System.out.println("\nDelete At Any Index");
        list.delete(2);
        list.display();
        list.reverseDisplay();
       
        System.out.println("\nGet Any Node Value");
        System.out.println(list.get(4));
        
        System.out.println("\nChange Value Of Any Node");
        list.set(2, 500);
        list.display();
        list.reverseDisplay();

        System.out.println("size of list is : " + list.size);
        System.out.println();
        list.sizemethod();
        
    }
    
}
