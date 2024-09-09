package Recursion;

public class stringTraversal {
    public static void print(int i , String s){
        if(i==s.length()) return;
        System.out.print(s.charAt(i));
        print(i+1,s) ;
    }
    public static void skip(int i , String s , String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        } 
        if(s.charAt(i)!='a') ans += s.charAt(i) ;
        skip(i+1,s,ans);
    }
    
    public static void main(String[] args) {
        String s = "Chandrakant Mane" ;
        // print(0 , s);
        skip(0,s,"");
    }
}
