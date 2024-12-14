package Hashmaps;

import java.util.HashSet;

public class leetCodeQ2744 {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] words = { "cd", "ac", "dc", "ca", "zz" } ;
        HashSet<String> set = new HashSet<>() ;
        int count = 0 ;
        for(int i = 0 ; i < words.length ; i++){
            String rev = reverse(words[i]) ;
            if(set.contains(rev)){
                count++ ;
                set.remove(rev) ;
            }
            else set.add(words[i]) ;
        }
        System.out.println(count);
    }
}
