package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class fractionalKnapsack {
    static class Item {
        int val;
        int wt;

        public Item(int val, int wt) {
            this.val = val;
            this.wt = wt;
        }

        public String toString(){
            return "val is : " + val  + " wt is : " + wt ;
        }

        Comparator<Item> com = new Comparator<Item>(){
            public int compare(Item i , Item j){
                double d1 = (double) i.val / (double) i.wt ;
                double d2 = (double) j.val / (double) j.wt ;

                if(d1 < d2)
                    return 1 ;
                else if(d1 > d2) 
                    return -1 ;
                else 
                    return 0 ;
            }
        };

    }
    public static double helper(int c , List<Item> list , int n ){
        int curwt = 0 ;
        double finalvalue = 0.0 ;

        for(int i = 0 ; i < n ; i++){
            if(curwt + list.get(i).wt <= c ){
                curwt += list.get(i).wt ;
                finalvalue += list.get(i).val ;
            }
            else{
                int remwt = c - curwt ;
                finalvalue += (double) list.get(i).val / (double) list.get(i).wt * (double) remwt ; 
                break ;
            }
        }
        return finalvalue ;
    }
    public static void main(String[] args) {
        int capacity = 50 ;
        List<Integer> val = new ArrayList<>() ;
        val.add(60) ;   val.add(100) ;  val.add(120) ;

        List<Integer> wt = new ArrayList<>() ;
        wt.add(10) ;    wt.add(20) ;    wt.add(30) ;

        List<Item> list = new ArrayList<>() ;
        for(int i = 0 ; i < val.size() ; i++){
            list.add(new Item(val.get(i), wt.get(i))) ;
        }

        Item a = new Item(0, 0) ;
        Collections.sort(list , a.com);

        for(Item i : list){
            System.out.println(i);
        }

        System.out.println(helper(capacity, list, list.size()));

    } 
}
