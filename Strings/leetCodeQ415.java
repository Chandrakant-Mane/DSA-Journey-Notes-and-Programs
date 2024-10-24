package Strings;

public class leetCodeQ415 {
    public static void main(String[] args) {
        String num1 = "456" ;
        String num2 = "77" ;

        int m = num1.length() ;
        int n = num2.length() ;
        int i = m-1 , j = n-1 ;
        StringBuilder res = new StringBuilder();
        int carry = 0 ;
        while(i >= 0 ||  j >= 0 ){
            int val1 = 0 , val2 = 0 ;
            if(i >= 0 ) val1 = num1.charAt(i) - '0' ;
            if(j >= 0 ) val2 =  num2.charAt(j) - '0' ;
            int num = val1 + val2 + carry ;
            res.append(num%10) ;
            if(num>9) carry = 1 ;
            else carry = 0 ;
            if(i >= 0) i-- ;
            if(j >= 0) j-- ;
        }
        if(carry > 0){
            res.append(carry) ;
        }

        System.out.println(res);
        System.out.println(res.reverse().toString());
        
    }
}
