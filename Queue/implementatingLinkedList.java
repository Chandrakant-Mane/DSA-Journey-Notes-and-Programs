package Queue;

public class implementatingLinkedList {

    public static class Node{ // User def data type 
        int val ;
        Node next ;

        Node(int val){
            this.val = val ;
        }
    }

    public static class queueLL{
        Node head ;
        Node tail ;
        int size = 0 ;

        public void add(int x){
            Node temp = new Node(x) ;
            if(size == 0){
                head = tail = temp ;
            }
            else{
                tail.next = temp ;
                tail = temp ;
            }
            size++ ;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            else{
                int x = head.val ;
                head = head.next  ;
                size--;
                return x ;
            }
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            return head.val ;
        }

        public void display(){
            if (size == 0) {
                System.out.println("Queue is Empty");
                return ;
            }
            else{
                Node temp = head ;
                while(temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next ;
                }
                System.out.println();
            }
        }
        
        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        queueLL q1 = new queueLL() ;
        System.out.println("Without Adding : ");
        System.out.println("Q1 size is : " + q1.size);
        System.out.println("Q1 is Empty ? " + q1.isEmpty());
        System.out.println("Display Queue : ");
        q1.display();
        System.out.println();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("After Adding values : ");
        System.out.println("Q1 size is : " + q1.size);
        System.out.println("Q1 is Empty ? " + q1.isEmpty());
        System.out.println("Display Queue : ");
        q1.display();
        
        System.out.println();

        System.out.println("Q1 peek() ele is : " + q1.peek());

        System.out.println();


        System.out.println("After removing : ");
        System.out.println("Q1 remove() ele : " + q1.remove());
        System.out.println("Q1 size is : " + q1.size);
        System.out.println("Q1 is Empty ? " + q1.isEmpty());
        System.out.println("Display Queue : ");
        q1.display();


    }
}
