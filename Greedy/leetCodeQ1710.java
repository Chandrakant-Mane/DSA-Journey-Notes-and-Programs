package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class leetCodeQ1710 {
    public static void main(String[] args) {
        int[][] boxTypes = { { 5, 10 } , { 3, 9 } , { 4 , 7} , { 2 , 5}} ;
        int truckSize = 10;

        Comparator<int[]> comStud = new Comparator<int[]>() {
            public int compare(int[] i, int[] j) {
                return j[1] - i[1];
            }
        };
         
        Arrays.sort(boxTypes , comStud);

        int sum = 0 ;
        for(int i = 0 ; i < boxTypes.length ; i++){
            int noOfBox = boxTypes[i][0] ;
            int noOfUnits = boxTypes[i][1] ;
            int min = Math.min(truckSize, noOfBox) ;
            truckSize -= min ;
            sum += min * noOfUnits ;
            if(truckSize == 0){
                System.out.println(sum);
                break ;
            }
        }

        // System.out.println(sum);

    }
}
