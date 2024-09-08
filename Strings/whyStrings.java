package Strings;

public class whyStrings {
    public static void main(String[] args) {
        // " Chandrakant "
        char[] arr = {'C','h','a','n','d','r','a','k','a','n','t'} ;

        // Output Using For Each Loop 
        for(char ele : arr){
            System.out.print(ele);
        }

        // Output Using Normal Loop 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);   
        }

        String x = "Chandrakant Mane ";
        System.out.println(x);
    }
    
}
