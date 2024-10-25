package Stacks;

import java.util.Stack;

public class leetCodeQ1047 {
    public static void main(String[] args) {
        String s = new String("abbaca") ;
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c)
                st.pop();
            else
                st.push(c);
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        System.out.println(res.reverse().toString()); 
    }
}
