package DynamicProgramming;

import java.util.Arrays;

public class leetCodeQ354 {
    public static class Envelop implements Comparable<Envelop> {
        int w;
        int h;

        Envelop(int w, int h) {
            this.w = w;
            this.h = h;
        }

        public int compareTo(Envelop e) {
            if (this.w == e.w)
                return e.h - this.h;
            return this.w - e.w;
        }
    }
    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length ;
        Envelop[] arr = new Envelop[n] ;
        for(int i = 0 ; i < n ; i++){
            int w = envelopes[i][0] ;
            int h = envelopes[i][1] ;
            arr[i] = new Envelop(w , h) ;
        }
        Arrays.sort(arr) ;
        // LIS on this arr.h
        int[] dp = new int[n] ;
        int ans = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i-1 ; j++){
                if(arr[j].h < arr[i].h)
                    dp[i] = Math.max(dp[i] , dp[j]) ;
            }
            dp[i] += 1 ;
            ans = Math.max(dp[i] , ans) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[][] envelopes = { { 5,4 } , { 6,4 } , { 6,7 } , { 2,3 }} ;

        System.out.println(maxEnvelopes(envelopes));

    }
}
