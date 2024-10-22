package Linked_List;

class NodeList{
    public int val;
    NodeList head ;
    public NodeList prev;
    public NodeList next;
    public NodeList child;
    NodeList(int val){
        this.val = val ;
    }
}

public class leetCodeQ430 {
    public static void display(NodeList head){
        NodeList temp = head ;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; 
        }
        System.out.println();
    }
    public static NodeList flatten(NodeList head) {
        NodeList temp = head ;
        while(temp != null){
            NodeList n = temp.next ;
            if(temp.child != null){
                NodeList c = flatten(temp.child);
                NodeList d = c ;
                while(d.next != null) d = d.next ;
                temp.next = c ;  c.prev = temp ;
                d.next = n ;   
                if(n!=null) n.prev = d;
                temp.child = null ;

            }
            temp = n ;
        
        }
        return head ;
    }
    public static void main(String[] args) {
        NodeList a = new NodeList(1);
        NodeList b = new NodeList(2);
        NodeList c = new NodeList(3);
        NodeList d = new NodeList(4);
        NodeList e = new NodeList(5);
        NodeList f = new NodeList(6);
        a.next = b ;  b.prev = a ;
        b.next = c ;  c.prev = b ;
        c.next = d ;  d.prev = c ;
        d.next = e ;  e.prev = d ;
        e.next = f ;  f.prev = e ;
        // display(f);

        NodeList l = new NodeList(7);
        NodeList m = new NodeList(8);
        NodeList n = new NodeList(9);
        NodeList o = new NodeList(10);
        l.next = m ; m.prev = l ;
        m.next = n ; n.prev = m ;
        n.next = o ; o.prev = n ;
        // display(o);

        NodeList x = new NodeList(11);
        NodeList y = new NodeList(12);
        x.next = y ; y.prev = x ;
        // display(y);

        c.child = l ;
        m.child = x ;

        System.out.println(m.child.val);

        NodeList newHead = flatten(a) ;
        display(newHead);

    }
}
