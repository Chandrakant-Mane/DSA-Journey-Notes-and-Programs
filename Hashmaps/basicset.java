package Hashmaps;
import java.util.HashSet;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;
        // Insert : TC = O(1)
        set.add(20) ;
        set.add(100) ;
        set.add(10) ;

        System.out.println("size is : " + set.size());
        set.add(-8) ;
        set.add(200) ;
        System.out.println("size is : " + set.size());

        // Search - true / false : TC = O(1) 
        System.out.println(set.contains(50));
        set.add(50) ;
        System.out.println("size is : " + set.size());
        System.out.println(set.contains(50));

        System.out.println(set); // TC = O(1)

        // Remove : TC = O(1) 
        set.remove(100) ;

        System.out.println(set);
        System.out.println("size is : " + set.size());

        set.remove(1000) ;

        Object[] arr = set.toArray() ;

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
