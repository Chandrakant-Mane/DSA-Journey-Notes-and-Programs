package Stacks;

import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>() ;
        st.push(arr[n-1]);
        res[n-1] = -1 ;
        for (int i = n-2; i >= 0; i--) {
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
