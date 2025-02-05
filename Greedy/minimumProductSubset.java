package Greedy;

public class minimumProductSubset {

    public static int minProduct(int[] a){
        int n = a.length ;
        if(n == 1) 
            return a[0] ;

        int negMax = Integer.MIN_VALUE ;
        int posMin = Integer.MAX_VALUE ;
        int count_Neg = 0 , count_Zero = 0 ;
        int product = 1 ;

        for(int i = 0 ; i < n ; i++){
            if(a[i] == 0){
                count_Zero++ ;
                continue ;
            }
            if(a[i] < 0){
                count_Neg++ ;
                negMax = Math.min(negMax, a[i]) ;
            }
            if(a[i] > 0 && a[i] < posMin){
                posMin = a[i] ;
            }
            product *= a[i] ;
        }

        if(count_Zero == n || (count_Neg == 0 && count_Zero > 0))
            return 0 ;
        if(count_Neg == 0)
            return posMin ;
        if(count_Neg % 2 == 0 && count_Neg != 0){
            product = product / negMax ;
        }

        return product ;
    
    }
    public static void main(String[] args) { 
        int[] a = { -1 , -1 , -2 , 4 , 3 } ;

        System.out.println(minProduct(a));
        
    }
}
