package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertAtAnyIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>() ;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.print("Enter Element : ");
        int new_ele = sc.nextInt();
        System.out.print("Enter Index : ");
        int idx = sc.nextInt() ;
        Stack<Integer> st_temp = new Stack<>() ;
        while (st.size() >= idx) {
            st_temp.push(st.pop());
        }
        st.push(new_ele);
        while(!st_temp.isEmpty()){
            st.push(st_temp.pop()) ;
        }

        System.out.println(st);
        sc.close();
    }
}
