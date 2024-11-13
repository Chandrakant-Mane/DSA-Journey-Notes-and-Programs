package Queue;

public class circularQueueLL {
    public static class Node{
        int val ;
        Node next ;

        Node(int val){
            this.val = val ;
        }
    }

    public static class CircularLL{
        Node head ;
        Node tail ;
        int size = 0 ;

        public void add(int val){
            Node temp = new Node(val) ;
            if(size == 0){
                head = tail = temp ;
            }
            else{
                tail.next = temp ;
                tail = temp ;
                tail.next = head ;
            }
            size++ ;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty") ;
            }
            else{
                int x = head.val ;
                head = head.next ;
                tail.next = head ;
                size-- ;
                return x ;
            }
        }

        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            return head.val ;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return ;
            }
            else{
                Node temp = head ;
                while(true){
                    System.out.print(temp.val+ " ");
                    if(temp.next == head)
                        break ;
                    temp = temp.next ;
                }
                System.out.println();
            }
        }

        public boolean isEmpty(){
            if(size == 0) return true ;
            else return false ;
        }

    }
    public static void main(String[] args) throws Exception {
        CircularLL q = new CircularLL() ;
        System.out.println("Before Adding values : ");
        System.out.println("Queue size is : " + q.size);
        System.out.println("Display Queue : ");
        q.display(); 

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("After Adding values : ");
        System.out.println("Queue size is : " + q.size);
        System.out.println("Display Queue : ");
        q.display();

        System.out.println("Queue peek() ele is : " + q.peek());

        System.out.println("Queue remove() : " + q.remove());

        System.out.println("Queue peek() ele is : " + q.peek());

        System.out.println();

        System.out.println("Queue size is : " + q.size);
        System.out.println("Display Queue : ");
        q.display();
        
    }
}
