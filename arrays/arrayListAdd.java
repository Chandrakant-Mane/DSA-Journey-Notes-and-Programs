package arrays;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+ " " + list.size());
        list.add(60);
        System.out.println(list+ " " + list.size());
        list.add(20);
        System.out.println(list+ " " + list.size());
        list.add(204);
        System.out.println(list+ " " + list.size());
        list.add(-45);
        System.out.println(list+ " " + list.size());
        list.add(6);
        System.out.println(list+ " " + list.size());

        
        list.remove(3);
        System.out.println(list+ " " + list.size());
    }
    
}
