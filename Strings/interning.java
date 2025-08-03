package Strings;

public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String q = "Raghav";
        String t = new String("Raghav");
        // Raghav  >  Madhav
        // s.charAt(0) = 'M';    Error 
        // s.charAt(2) = "d";    Error 
        // s = "Madhav";
        // q = "Madhav";
        System.out.println(s == q);
        // System.out.println(q);
        System.out.println(t==s);



        // int[] arr = {1,2,3};
        // int[] brr = arr;
        // brr[0] = 10 ;
        // System.out.println(arr[0]);
        
        
    }
    
}
