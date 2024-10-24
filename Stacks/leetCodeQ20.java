package Stacks ;

import java.util.Stack;

public class leetCodeQ20 {
    public static void main(String[] args) {
        
        String s = new String("()[]{}") ;

        Stack<Character> st = new Stack<Character>() ;
        for(char ele : s.toCharArray()){
            if(ele == '(' ){
                st.push(')');
            }
            else if(ele == '{'){
                st.push('}');
            }
            else if(ele == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != ele){
                System.out.println("False");
            }
        }
        System.out.println(st.isEmpty());
    }
}
