package Graph;

public class leetCodeQ785DSU {
    static int[] parent, size;
    static boolean[] parity;

    public static int leader(int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = leader(parent[a]);
    }

    public static void union(int u, int v) {
        int a = leader(u);
        int b = leader(v);
        if (a != b) {
            if (size[a] > size[b]) {
                parent[b] = a;
                size[a] += size[b];
                parity[v] = !parity[u]; // smaller wale ki parity change karo
            } else {
                parent[a] = b;
                size[b] += size[a];
                parity[u] = !parity[v];
            }
        }
    }

                // DSU
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        parent = new int[n];
        size = new int[n];
        parity = new boolean[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
            parity[i] = false;
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                int u = i, v = graph[i][j];
                if (v > u) {
                    if (leader(u) == leader(v)) { // Cycle Detected
                        if (parity[u] == parity[v])
                            return false;
                    } else
                        union(u, v);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] graph = { { 1 , 2 , 3} , { 0 , 2 } , { 0 , 1 , 3 } , { 0 , 2 } } ;
        System.out.println(isBipartite(graph));
    }
    
}
