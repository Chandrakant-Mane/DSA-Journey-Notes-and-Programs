package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Stack<Integer> st = new Stack<>() ;
        int n ;
        System.out.println("Enter the No. Of Ele You Want To Insert : ");
        n = sc.nextInt() ;
        System.out.println("Enter The Ele's : ");
        for(int i = 1 ; i <= n ; i++){
            int x = sc.nextInt() ;
            st.push(x);
        }

        System.out.println(st);
        sc.close();
    }
}
