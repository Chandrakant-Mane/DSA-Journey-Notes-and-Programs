package Queue;

public class dequeImplUsingArray {
    static class dequeArray{
        int front = -1 ;
        int rear = -1 ; 
        int size = 0 ;
        int[] arr = new int[5] ;

        void insert(int val){
            if(rear == arr.length - 1){
                System.out.println("Deque is Full");
                return ;
            }
            if(front == -1){
                front = rear = 0 ;
                arr[rear] = val ;
            }
            else{
                arr[++rear] = val ;
            }
            size++ ;
        }

        int deleteFront(){
            if(size == 0){
                System.out.println("Deque is Empty");
                return -1 ;
            }
            else{
                int val = arr[front++] ;
                size-- ;
                return val ;
            }
        }
        
        int deleteRear() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return -1;
            } 
            else {
                int val = arr[rear--];
                size--;
                return val;
            }
        }

        int getFront(){
            if(size == 0){
                System.out.println("Underflow");
                return -1 ;
            }
            return arr[front] ;
        }
        
        int getRear() {
            if (size == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return arr[rear];
        }

        void displayFront(){
            if(size == 0){
                System.out.println("Underflow");
            }
            else{
                for(int i = front ; i <= rear ; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

        void displayRear() {
            if (size == 0) {
                System.out.println("Underflow");
            } 
            else {
                for (int i = rear; i >= front; i--) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

        boolean isEmpty(){
            return (size == 0) ;
        } 

        int size(){
            return size ;
        }
    }
    public static void main(String[] args) {
        dequeArray dqe = new dequeArray() ;

        System.out.println("dqe isEmpty or Not ? " + dqe.isEmpty());
        System.out.println("dqe size is : " + dqe.size());
        System.out.println();

        dqe.insert(10);
        dqe.insert(20);
        dqe.insert(30);
        dqe.insert(40);
        dqe.insert(50);

        System.out.println("display dqe : ");
        dqe.displayFront();
        dqe.displayRear() ;

        System.out.println();

        System.out.println("dqe isEmpty or Not ? " + dqe.isEmpty());
        System.out.println("dqe size is : " + dqe.size());
        System.out.println();

        System.out.println("Get dqe front ele : " + dqe.getFront());
        System.out.println("Get dqe rear ele : " + dqe.getRear());
        System.out.println();

        System.out.println("Delete from front " + dqe.deleteFront());
        System.out.println("Delete from rear " + dqe.deleteRear());

        System.out.println();

        System.out.println("display dqe : ");
        dqe.displayFront();
        dqe.displayRear();
        System.out.println();
        System.out.println("dqe isEmpty or Not ? " + dqe.isEmpty());
        System.out.println("dqe size is : " + dqe.size());

    }
}
