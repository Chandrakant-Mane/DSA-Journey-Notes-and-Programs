package Hashmaps;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>() ;
        set.add(-8) ;
        set.add(100) ;
        set.add(58) ;
        set.add(76) ;
        set.add(89) ;

        System.out.println(set);
        for(int ele : set){
            System.out.print(ele + " ");
        }
    }
}
