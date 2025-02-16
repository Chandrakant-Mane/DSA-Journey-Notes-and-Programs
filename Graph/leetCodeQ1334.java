package Graph;

public class leetCodeQ1334 {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                dist[i][j] = Integer.MAX_VALUE ;
            }
        }
        for(int[] arr : edges){
            int u = arr[0] ;
            int v = arr[1] ;
            int wt = arr[2] ;
            dist[u][v] = wt ;
            dist[v][u] = wt ;
        }

        // Floyd Warshal Algo
        for(int k = 0 ; k < n ; k++){ // Through k 
            for(int i = 0 ; i < n ; i++){
                if(i == k) 
                    continue ;
                for(int j = 0 ; j < n ; j++){
                    if(j == k)
                        continue ;
                    if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE)
                        dist[i][j] = Math.min(dist[i][j] , dist[i][k] + dist[k][j]) ;
                }
            }
        }
        int minCity = -1 ;
        int minCount  = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++){
            int count = 0 ;  // From i to j where dist[i][j] <= threshold 
            for(int j = 0 ; j < n ; j++){
                if(i == j)
                    continue ;
                if(dist[i][j] <= distanceThreshold)
                    count++ ;
            }
            if(count <= minCount){
                minCount = count ;
                minCity = i ;
            }
        }
        return minCity ;    
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = { { 0, 1, 3 }, { 1, 2, 1 }, { 1, 3, 4 }, { 2, 3, 1 } };
        int distanceThreshold = 4;
        System.out.println(findTheCity(n, edges, distanceThreshold));
    }
    
}
