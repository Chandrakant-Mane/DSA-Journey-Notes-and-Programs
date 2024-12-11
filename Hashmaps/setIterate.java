package Hashmaps;

import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;
        // int[] arr = {4 , 9 , 2 , 6 , 4 , 8 , 1} ;

        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }

        System.out.println();

        set.add(20) ;
        set.add(100) ;
        set.add(10) ;
        set.add(-8) ;
        set.add(200) ;

        for (int ele : set) {
            System.out.print(ele + " ");
        }

        set.add(13) ;

        System.out.println();
        System.out.println(set);

        set.add(100) ;
        System.out.println(set);
        

        set.clear(); 
        System.out.println();
        System.out.println(set);

    }
}
