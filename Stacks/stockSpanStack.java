package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class stockSpanStack {
    public static void main(String[] args) {
        int[] price = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;

        int[] arr = new int[n];

        Stack<Integer> st = new Stack<>() ;
        st.push(0);
        for(int i = 0 ; i < n ; i++){
            while (!st.isEmpty() && price[i] >= price[st.peek()]) { 
                st.pop() ;
            }
            if(st.isEmpty())  arr[i] = i+1 ;
            else  arr[i] = i - st.peek() ;
            st.push(i);
        }

        System.out.println(Arrays.toString(arr));
        
    }
}
