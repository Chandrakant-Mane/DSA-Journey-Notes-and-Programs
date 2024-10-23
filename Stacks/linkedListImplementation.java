package Stacks;

public class linkedListImplementation {
    public static class Node{
        int val ;
        Node head ;
        Node tail ;
        Node next ;
        Node(int val){
            this.val = val ;
        }
    }

    public static class Stack{
        Node head ;
        Node tail ;
        int size = 0 ;

        void push(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp  ;
                size++ ;
            } 
            else{ 
                temp.next = head ;
                head = temp ;
                size++ ;
            }
        }

        int size(){
            return size ;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty...");
                return -1 ;
            }
            int x = head.val ;
            head = head.next ;
            size-- ;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty...");
                return -1 ;
            }
            int x = head.val ;
            return x ;
        }

        boolean isEmpty(){
            if(size == 0) return true ;
            return false ;
        }

        void display(){
            displayRec(head);
        }

        void displayRec(Node h){
            if(h == null) return ;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
        System.out.println();
        System.out.println(st.isEmpty());
        System.out.println(st.tail.val);
    }
}
