package Hashmaps;

import java.util.HashSet;

public class addSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>() ;
        set.add("Raghav") ;
        set.add("Raghav") ;
        set.add("Raghav") ;
        set.add("Raghav") ;
        set.add("Raghav") ;
        set.add("Himanshu") ;
        set.add("Gagan") ;
        set.add("Harish") ;
        System.out.println(set + " set size is : " + set.size());
        set.remove("Raghav") ;
        System.out.println(set + " set size is : " + set.size());


    }
}
