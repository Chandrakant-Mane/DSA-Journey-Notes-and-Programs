package Stacks;


public class implementationOfArray {
    public static class Stack{
        private int[] arr = new int[5];
        int n = arr.length ;
        private int idx = 0 ; 

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return ;
            }
            arr[idx] = x ;
            idx++ ;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1 ;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0 ;
            idx-- ;
            return top ;
        }

        int peek(){
            if(idx == 0){
                System.out.println("The Stack is Empty");
                return -1 ;
            }
            return arr[idx-1] ;
        }

        void display(){
            for(int i = 0 ; i <= idx - 1 ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx ;
        }

        boolean isEmpty(){
            if(idx == 0) return true ;
            else return false ;
        }

        boolean isFull(){
            if(arr.length == idx) return true ;
            return false;
        }

        int displayEle(int x ){
            if(x < 0 || x > n){
                System.out.println("Error in Index..");
                return -1 ;
            }
            else return arr[x-1];
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack() ;
        st.push(10) ;
        st.push(20) ;
        st.push(30) ;
        st.push(40) ;
        System.out.println("Display Stack : ");
        st.display(); ;

        System.out.println("Print peek ele : ");
        System.out.println(st.peek());

        System.out.println("Print size of Stack : ");
        System.out.println(st.size());

        System.out.println("Using pop methode : ");
        System.out.println(st.pop());

        System.out.println("After pop checking the size of Stack : ");
        System.out.println(st.size());

        System.out.println("After pop display Stack : ");
        st.display(); 

        System.out.println("Cheking stack is empty : ");
        System.out.println(st.isEmpty());

        st.push(40);
        st.push(50);

        System.out.println("After push display Stack : ");
        st.display(); 
        
        System.out.println("After push cheking stack is full or not : ");
        System.out.println(st.isFull());

        // st.push(60);

        System.out.println(st.displayEle(6));



    }
}
