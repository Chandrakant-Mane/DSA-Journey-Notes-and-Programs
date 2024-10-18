package Linked_List;

class DLLPalindrome{
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
    public boolean palindrom(){
        dNode i = head ;
        dNode j = tail ;
        while(i.prev != j){
            if(i.val != j.val || i == j) return false ;
            else{
                i = i.next ;
                j = j.prev ;
            }
        }
        return true ;

    }
}

public class doublyPalindrom {
    public static void main(String[] args) {
        DLLPalindrome list = new DLLPalindrome() ;
        list.display(); 
        list.insertAtTail(1);
        list.insertAtTail(2);
        // list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(1);
        list.display(); 

        System.out.println(list.palindrom());

    }
}
