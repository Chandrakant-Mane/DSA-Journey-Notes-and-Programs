package Queue;

public class circularQueueArray {
    public static class cQueArr{
        int front = -1 ;
        int rear = -1 ;
        int size = 0 ;
        int[] arr = new int[5] ;

        public void add(int val){
            if(size == arr.length){
                System.out.println("Array is full");
                return ;
            }
            else if(size == 0){
                arr[0] = val ;
                front = rear = 0 ;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val ;
            }
            else if(rear == arr.length - 1){
                // rear is pointing to last index 
                rear = 0 ;
                arr[0] = val ;
            }
            size++ ;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            else{
                int val = arr[front] ;
                if(front == arr.length-1) front = 0;
                else front++ ;
                size-- ;
                return val ;
            }
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            else return arr[front] ;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return ;
            }
            else if(front <= rear){
                for(int i = front ; i <= rear ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                // rear < front 
                for(int i = front ; i < arr.length ; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0 ; i <= rear ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(size == 0)
                return true ;
            return false ;
        }

        public int size(){
            return size ;
        }

        public boolean isFull(){
            if(size == arr.length) return true ;
            return false ;
        }
    }
    public static void main(String[] args) {
        cQueArr q = new cQueArr() ;

        System.out.println("Queue is empty ? " +q.isEmpty());

        q.display(); 

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        System.out.println(q.remove());

        q.add(5);
        q.add(6);
        
        q.display();

        q.add(7);

        System.out.println(q.remove());
        q.add(7);
        
        q.display();

        System.out.println(q.remove());
        System.out.println("Queue is Full ? " + q.isFull());

        q.add(8);
        q.display();

        System.out.println(q.size());

        System.out.println("rear is at : " + q.rear);
        System.out.println("front is at : " + q.front);
        System.out.println("Queue is empty ? " + q.isEmpty());

        System.out.println("Queue is Full ? " + q.isFull());

    }
}
