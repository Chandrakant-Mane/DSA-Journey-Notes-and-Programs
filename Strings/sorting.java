package Strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = {'z','g','b','y'};
        char[] sh = s.toCharArray();
        System.out.println(ch);
        for(char ele : sh){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(sh);
        for(char ele : sh){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("garg");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
