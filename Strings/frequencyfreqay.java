package Strings;

import java.util.Scanner;

public class frequencyfreqay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        // 0-a , 1-b , 2-c , .... 25-z
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = (int)ch - 97 ;
            freq[idx]++ ;
            // freq[(int)s.charAt(i)-97]++;
            // int x = s.charAt(i);
            // freq[x-97] += 1 ;
        }
        int maxFreq = -1 ;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq,freq[i]);  
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.print(ch+ " ");
            }
            
        }
        sc.close();

    }
}
