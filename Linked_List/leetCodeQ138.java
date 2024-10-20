package Linked_List;

class NodeL{
    int val ;
    NodeL next ;
    NodeL random ;
    NodeL(int val){
        this.val = val ;
    }
}

public class leetCodeQ138 {
    public static NodeL deepCopy(NodeL head){
        NodeL head2 = new NodeL(head.val);
        NodeL t1 = head.next ;
        NodeL t2 = head2 ;
        while(t1 != null){
            NodeL temp = new NodeL (t1.val);
            t2.next = temp ;
            t2 = t2.next ;
            t1 = t1.next ;
        }
        return head2;
    }
    public static void connectAlternatively(NodeL head , NodeL head2){
        NodeL dummy = new NodeL(-1);
        NodeL t1 = head ;
        NodeL t2 = head2 ;
        NodeL t = dummy ;
        while(t1 != null && t2 != null){
            t.next = t1 ;
            t = t.next ;
            t1 = t1.next ;
            t.next = t2 ;
            t = t.next ;
            t2 = t2.next ;
        }
    }
    public static void assignRandom(NodeL head ,NodeL head2){
        NodeL t1 = head ;
        NodeL t2 = head2 ;
        while(t1 != null){
            t2 = t1.next;
            if(t1.random != null) t2.random = t1.random.next ;
            t1 = t1.next.next ;
        }
    }
    public static void split(NodeL head , NodeL head2){
        NodeL t1 = head ;
        NodeL t2 = head2 ;
        while(t1 != null){
            t1.next = t2.next ;
            t1 = t1.next ;
            if(t1 == null ) break ;
            t2.next = t1.next ;
            t2 = t2.next ;
        }
    }
    public static NodeL copyRandomList(NodeL head) {
        if(head == null) return null;
        // Step 1 : Create Deep Copy Without Random Connections 
        NodeL head2 = deepCopy(head);
        // Step 2 : Join head And head2 alternatively 
        connectAlternatively(head,head2);
        // Step 3 : Assign Random Pointers
        assignRandom(head,head2);
        // Step 4 : Split the Linked List
        split(head , head2);
        return head2 ;
    }
    public static void display(NodeL head){
        NodeL temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void printRandom(NodeL head){
        NodeL temp = head ;
        while(temp != null){
            if(temp.random == null) System.out.print("null ");
            else System.out.print(temp.random.val + " ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NodeL a = new NodeL(7);
        NodeL b = new NodeL(13);
        NodeL c = new NodeL(11);
        NodeL d = new NodeL(10);
        NodeL e = new NodeL(1);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        b.random = a ;
        c.random = e ;
        d.random = c ;
        e.random = a ;

        NodeL head2 = copyRandomList(a) ;

        display(head2);
        printRandom(head2);
        

    }

}
