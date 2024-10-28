package Stacks;

import java.util.Stack;

public class previousGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 100,80,60,70,60,75,85 };
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>() ;
        st.push(arr[0]);
        res[0] = -1 ;
        for (int i = 1; i < n; i++) {
            while(st.size() > 0 && st.peek() < arr[i]) {
                st.pop() ;
            }
            if(st.size() == 0) res[i] = -1 ;
            else res[i] = st.peek() ;
            st.push(arr[i]) ;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
