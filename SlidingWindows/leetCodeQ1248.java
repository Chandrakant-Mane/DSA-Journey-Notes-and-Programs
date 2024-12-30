package SlidingWindows;

import java.util.HashMap;

public class leetCodeQ1248 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 } ;
        int k = 2 ;
        int n = arr.length , count = 0 ;
        for(int i = 0 ; i < n ; i++){
            arr[i] %= 2 ;
        }
        for(int i = 1 ; i < n ; i++){
            arr[i] += arr[i-1] ;
        }

        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , i) ;
            }
            int a = 0 ;
            if(map.containsKey(arr[i] - k))
                    a = map.get(arr[i]-k) ;

            int b = 0 ;
            if(map.containsKey(arr[i]-k+1))
                    b = map.get(arr[i]-k+1) ;

            if(arr[i] == k){
                count += (b - a + 1) ;
            }
            if(arr[i] > k){
                count += (b - a) ;
            }
        }

        System.out.println(count);
    }
}
