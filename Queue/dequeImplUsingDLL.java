package Queue;

public class dequeImplUsingDLL {

    static class Node{
        int data ;
        Node prev , next ;
        Node(int data){
            this.data = data ;
        }
    }
    static class Deque{
        Node front ;
        Node rear ;
        int size ;

        Deque(){
            front = rear = null ;
            size = 0 ;
        }

        boolean isEmpty(){
            if(size == 0 ) return true ;
            return false ;
        }

        int size(){
            return size ;
        }

        void insertFront(int data){
            Node newNode = new Node(data) ;
            if(front == null){
                // deque is empty 
                rear = front = newNode ;
            }
            else{
                newNode.next = front ;
                front.prev = newNode ;
                front = newNode ;
            }
            size++ ;
        }

        void insertRear(int data){
            Node newNode = new Node(data) ;
            if (rear == null) {
                // deque is empty
                rear = front = newNode;
            }
            else{
                newNode.prev = rear ;
                rear.next = newNode ;
                rear = newNode ;
            }
            size++;
        }

        void deleteFront(){
            if(size == 0){
                System.out.println("Underflow");
            }
            else{
                front = front.next ;
                if(front == null)   rear = null ;
                else{
                    front.prev = null ;
                }
                size-- ;
            }
        }

        void deleteRear(){
            if(size == 0){
                System.out.println("Underflow");
            }
            else{
                rear = rear.prev ;
                if(rear == null)  front = null ;
                else  rear.next = null ;
                size-- ;
            }
        }

        int getFront(){
            if(size == 0){
                System.out.println("Underflow");
                return -1 ;
            }
            return front.data ;
        }

        int getRear() {
            if (size == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return rear.data;
        }
    }
    public static void main(String[] args) {
        Deque dq = new Deque() ;

        System.out.println("Inserting 5 at Rear End ");

        dq.insertRear(5);
        System.out.println("Inserting 10 at Rear End ");
        dq.insertRear(10);
        System.out.println(dq.size());

        System.out.println(dq.isEmpty());
        System.out.println("Rear end element " + dq.getRear());

        dq.deleteRear() ;
        System.out.println("Rear end element " + dq.getRear());

        dq.deleteRear();
        System.out.println("Rear end element " + dq.getRear());

        System.out.println(dq.isEmpty());

        dq.insertFront(5); 
        System.out.println("Front end element " + dq.getFront());
        dq.insertFront(10);
        System.out.println("Front end element " + dq.getFront());

        System.out.println("Front end element " + dq.getFront());
        dq.deleteFront();
        System.out.println("Front end element " + dq.getFront());

        dq.deleteFront();
        System.out.println("Front end element " + dq.getFront());

        System.out.println(dq.isEmpty());



    }
}
