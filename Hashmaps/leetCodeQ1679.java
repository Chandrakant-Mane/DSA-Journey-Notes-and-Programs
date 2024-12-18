package Hashmaps;

import java.util.HashMap;

public class leetCodeQ1679 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 3} ;
        int k = 6 ;

        HashMap<Integer, Integer> map = new HashMap<>() ;
        int count = 0 ;
        
        for(int ele : nums){
            int rem = k - ele ;
            // if map contains rem then there will be 2 case 
            if(map.containsKey(rem)){
                // count ++ ;
                count++ ;

                // Case 1 : rem freq == 1 mean we need to remove it because its pair is counted .
                if(map.get(rem) == 1){
                    map.remove(rem) ;
                }
                // Case 2 : rem freq > 1 mean we need to decrease freq by 1 because it used to for a Pair .
                else{
                    int freq = map.get(rem) ;
                    map.put(rem , freq - 1) ;
                }
            }
            // if map nor contains rem 
            else{
                // Case 1 : ele is already present in map then we just need to increase is frequency by 1 .
                if(map.containsKey(ele)){
                    int freq = map.get(ele) ;
                    map.put(ele , freq + 1) ;
                }
                // Case 2 : map not contain ele then add ele to map with freq 1 .
                else map.put(ele , 1) ;
            }
                
        }

        System.out.println(count);
    }
}
