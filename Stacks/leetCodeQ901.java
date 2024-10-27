package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class leetCodeQ901 {
        static Stack<int[]> st = new Stack<>();
        static int ind = -1 ;
        static ArrayList<Integer> arr = new ArrayList<>() ;

        public static int next(int price) {
            ind++;
            while (!st.isEmpty() && st.peek()[1] <= price) {
                st.pop();
            }
            int ans = ind - (st.isEmpty() ? -1 : st.peek()[0]);
            st.push(new int[] { ind, price });
            return ans;
        }
        
        public static int nextBrute(int price) {
            arr.add(price);
            int count = 1;
            for (int i = arr.size() - 2; i >= 0; i--) {
                if (arr.get(i) <= price)
                    count++;
                else
                    break;
            }
            return count;
        }

        public static void main(String[] args) {
            int[] arr = {100 , 80 , 60 , 70 , 60 , 75 , 85 };
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = next(arr[i]);
            }
            for(int ele : arr){
                System.out.print(ele + " ");
            }
        }
    
}
