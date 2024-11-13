package Queue;

public class arrayCircularQueue {
    public static class Cqa{
        int f = -1 ;
        int r = -1  ;
        int size = 0 ;
        int[] arr = new int[5] ;

        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Bhai Queue Full Hai!") ;
            }
            else if(size == 0){
                f = r = 0 ;
                arr[r] = val ;
            }
            else if(r < arr.length-1){ // Normal Case 
                arr[++r] = val ;
            }
            else if(r == arr.length-1){
                r = 0 ;
                arr[r] = val ;
            }
            size++ ;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Bhai Queue Empty Hai!") ;
            }
            else{
                int val = arr[f] ;
                if(f == arr.length-1) f = 0 ;
                else f++ ;
                size-- ;
                return val ; 
            }
        }

        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Bhai Queue Empty Hai!");
            }
            else return arr[f]  ;
        }

        public boolean isEmpty(){
            if(size == 0) return true ;
            else return false ;
        }

        public void display(){
            if (size == 0) {
                System.out.println("Bhai Queue Empty Hai!");
                return ;
            }
            else{
                if( f <= r){
                    for (int i = f; i <= r; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
                else{
                    for(int i = f ; i < arr.length ; i++){
                        System.out.print(arr[i] + " ");
                    }
                    for(int i = 0 ; i <= r ; i++){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa() ;
        q.display(); 

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.display(); 

        System.out.println(q.remove()); 
        q.display(); 

        q.add(6);
        q.display();

        for(int i = 0 ; i < q.arr.length ; i++){
            System.out.print(q.arr[i] + " ");
        }
    }
}
