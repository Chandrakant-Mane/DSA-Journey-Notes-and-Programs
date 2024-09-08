package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayListsTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10) ; a.add(20) ; a.add(30) ;
        List<Integer> b = new ArrayList<>();
        b.add(50); b.add(60);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(80);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a) ; l.add(b) ; l.add(c); l.add(d);

        // System.out.println(l.get(3));

        //  Using New ArrayList 
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
        
        
        l.clear();
        //  Without Using New ArrayList
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
    }
}
