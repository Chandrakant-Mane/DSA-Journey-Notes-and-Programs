package Queue;

public class implementatingArray {
    public static class QueueArray{
        int f = -1 ;
        int r = -1 ;
        int size = 0 ;
        int[] arr = new int[5] ;
    

        public void add(int val){
            if(r == arr.length - 1){
                System.out.println("Queue is Full");
                return ;
            }
            if(f == -1){
                f = r = 0 ;
                arr[r] = val ;
            }
            else{
                arr[++r] = val ;
            }
            size++ ;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            int x = arr[f] ;
            f++ ;
            size-- ;
            return x ;
        }

        public int peek(){
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f] ;
        }

        public boolean isEmpty(){
            if(size == 0) return true ;
            else return false ;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
            }
            else{
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray() ;
        q.display() ;

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        q.remove() ;
        q.display();
        
        System.out.println(q.peek());

        System.out.println(q.size);
    }
}
