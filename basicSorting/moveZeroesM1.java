package basicSorting;

import java.util.ArrayList;

public class moveZeroesM1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        ArrayList<Integer> arr = new ArrayList<>() ;
        int noz = 0 ; 
        for(int ele : nums){
            if(ele != 0) arr.add(ele) ;
            else noz++ ;
        }
        for (int i = 1; i <= noz; i++) {
            arr.add(0) ;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i) ;
            
        }
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
