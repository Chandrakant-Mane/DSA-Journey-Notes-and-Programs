package Stacks;

import java.util.Stack;

public class gfgCelebrityProblem {
    public static void main(String[] args) {
        int[][] M = {{0,1,0} , {0,0,0} , {0,1,0}} ;
        int n = M.length ;

        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ; i < n ; i++){
            st.push(i) ;
        }

        while (st.size() > 1) {
            int v1 = st.pop() ; 
            int v2 = st.pop() ; 
            if(M[v1][v2] == 0){ // Shayad v1 celeb ho , v2 to celeb nahe hai 
                st.push(v1) ;
            }
            else if(M[v2][v1] == 0) st.push(v2) ;
        }
        if(st.size() == 0) System.out.println("-1");
        else{
            int potential = st.pop() ;
            for(int j = 0 ; j < n ; j++){
                if(M[potential][j] == 1) System.out.println("-1");
            }

            for(int i = 0 ; i < n ; i++){
                if(i == potential) continue ;
                if(M[i][potential] == 0) System.out.println("-1");
            }

            System.out.println(potential);
        }
    }
}
