package Greedy;

import java.util.Arrays;

public class leetCodeQ455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s) ;
        Arrays.sort(g) ;
        int n = g.length , m = s.length ;
        int l = 0 , r = 0 ; 
        while(l < m && r < n){
            if(g[r] <= s[l]){ 
                r++ ;
            }
            l++ ;
        }
        return r ;
    }
    public static void main(String[] args) {
        int[] g = { 1 , 2 , 3 } ;
        int[] s = { 1 , 1 } ;

        System.out.println(findContentChildren(g, s));
    }
}
