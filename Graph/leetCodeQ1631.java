package Graph;

import java.util.PriorityQueue;

public class leetCodeQ1631 {
    static class Triplet implements Comparable<Triplet>{
        int row ;
        int col ; 
        int effort ;
        Triplet(int row , int col , int effort){
            this.row = row ; 
            this.col = col ;
            this.effort = effort ;
        }
        public int compareTo(Triplet t){
            if(this.effort == t.effort)
                return Integer.compare(this.row , t.row) ;
            return Integer.compare(this.effort , t.effort) ;
        }
    }
    public static int minimumEffortPath(int[][] arr) {
        int m = arr.length , n = arr[0].length ;
        int[][] ans = new int[m][n] ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[i][j] = Integer.MAX_VALUE ;
            }
        }
        ans[0][0] = 0 ;
        PriorityQueue<Triplet> pq = new PriorityQueue<>() ;
        pq.add(new Triplet(0 , 0 , 0)) ;
        int[] r = { -1 , 0 , 1 , 0} ;
        int[] c = { 0 , -1 , 0 , 1} ;
        while(pq.size() > 0){
            Triplet top = pq.remove() ;
            int row = top.row , col = top.col , effort = top.effort ;
            if(row == m-1 && col == n-1) 
                break ;

            for(int i = 0 ; i < 4 ; i++){
                int newRow = row + r[i] ;
                int newCol = col + c[i] ;
                if(newRow < 0 || newCol < 0 || newRow > m-1 || newCol > n-1 )
                    continue ;
                int eff = Math.abs(arr[row][col] - arr[newRow][newCol]) ;
                eff = Math.max(eff , effort) ;
                if(eff < ans[newRow][newCol]){
                    ans[newRow][newCol] = eff ;
                    pq.add(new Triplet(newRow , newCol , eff)) ;
                }
            }
            // if(row > 0){ // Going UP row-1
            //     int eff = Math.abs(arr[row][col] - arr[row-1][col]) ;
            //     eff = Math.max(eff , effort) ;
            //     if(eff < ans[row-1][col]){
            //         ans[row-1][col] = eff ;
            //         pq.add(new Triplet(row-1 , col , eff)) ;
            //     }
            // }
            // if(col > 0){ // Going Left col-1
            //     int eff = Math.abs(arr[row][col] - arr[row][col-1]) ;
            //     eff = Math.max(eff , effort) ;
            //     if(eff < ans[row][col-1]){
            //         ans[row][col-1] = eff ;
            //         pq.add(new Triplet(row , col-1 , eff)) ;
            //     }
            // }
            // if(row+1 < m){ // Going Down row+1 
            //     int eff = Math.abs(arr[row][col] - arr[row+1][col]) ;
            //     eff = Math.max(eff , effort) ;
            //     if(eff < ans[row+1][col]){
            //         ans[row+1][col] = eff ;
            //         pq.add(new Triplet(row+1 , col , eff)) ;
            //     }
            // }
            // if(col+1 < n){ // Going Right col+1
            //     int eff = Math.abs(arr[row][col] - arr[row][col+1]) ;
            //     eff = Math.max(eff , effort) ;
            //     if(eff < ans[row][col+1]){
            //         ans[row][col+1] = eff ;
            //         pq.add(new Triplet(row , col+1 , eff)) ;
            //     }
            // }
        }
        return ans[m-1][n-1] ;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 2 } , { 3, 8, 2 } , { 5, 3, 5 } } ;

        System.out.println(minimumEffortPath(arr));
    }
}
