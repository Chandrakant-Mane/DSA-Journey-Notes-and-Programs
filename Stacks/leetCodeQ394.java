package Stacks ;

import java.util.Stack;

public class leetCodeQ394 {
    public static void main(String[] args) {
        String s = new String("3[a]2[bc]") ;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']')
                st.push(ch);
            else {
                // get the substring
                StringBuilder sb = new StringBuilder();
                while (st.peek() != '[') {
                    sb.append(st.pop());
                }

                // remove '['
                st.pop();
                // Now Get The Number

                int k = 0;
                int base = 1;

                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k = (st.pop() - '0') * base + k;
                    base = base * 10;
                }

                while (k-- > 0) {
                    for (int i = sb.length() - 1; i >= 0; i--) {
                        st.push(sb.charAt(i));
                    }
                }

            }
        }
        char[] result = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        System.out.println(new String(result));
    }
}
