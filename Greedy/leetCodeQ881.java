package Greedy;

import java.util.Arrays;

public class leetCodeQ881 {
    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 } ;
        int limit = 3 ;
        int n = people.length ;
        int count = 0 ;
        Arrays.sort(people) ;
        int i = 0 , j = n-1 ;
        while(i <= j ){
            if(people[i] + people[j] <= limit){
                i++ ;
                j-- ;
            }
            else 
                j-- ;
            count++ ;
        }
        System.out.println(count);
    }
}
