package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetCodeQ2094 {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < digits.length ; i++){
            int key = digits[i] ;
            if(map.containsKey(key)){
                int freq = map.get(key) ;
                map.put(key , freq+1 ) ;
            }
            else map.put(key , 1) ;
        }
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 100 ; i < 1000 ; i += 2){
            int x = i ;
            int c = x%10 ;
            x /= 10 ;
            int b = x%10 ;
            x /= 10 ;
            int a = x ;
            if(map.containsKey(a)){
                int aFreq = map.get(a) ;
                map.put(a , aFreq-1) ;
                if(aFreq == 1) map.remove(a) ;
                if(map.containsKey(b)){
                    int bFreq = map.get(b) ;
                    map.put(b , bFreq-1) ;
                    if(bFreq == 1) map.remove(b) ;
                    if(map.containsKey(c)){
                        ans.add(i) ;
                    }
                    map.put(b,bFreq) ;
                }
                map.put(a,aFreq) ;
            }
        }
        int[] ans2 = new int[ans.size()] ;
        for(int i = 0 ; i < ans2.length ; i++){
            ans2[i] = ans.get(i) ;
        }

        
        for(int ele : ans2){
            System.out.print(ele + " ");
        }
    }
}
