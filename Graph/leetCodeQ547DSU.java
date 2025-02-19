package Graph; 

public class leetCodeQ547DSU {
        // DSU
    static int[] parent;
    static int[] size; // Optimization

    public static int find(int a) { // Returns the group leader of a
        if (parent[a] == a)
            return a;
        return parent[a] = find(parent[a]); // Path Compression .
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            if (size[a] > size[b]) { // a should be parent of b
                parent[b] = a;
                size[a] += size[b];
            } else {
                parent[a] = b;
                size[b] += size[a];
            }
        }

    }

    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        size = new int[n + 1];
        parent = new int[n + 1]; // 1 to n nodes .
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                // edge is from i+1 to j+1
                if (i != j && adj[i][j] == 1)
                    union(i + 1, j + 1); // Connecting Group Leaders of i+1 and j+1
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] == i)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] adj = { { 1, 1, 0 } , { 1, 1, 0 } , { 0, 0, 1 }} ;
        System.out.println(findCircleNum(adj));
    }
}
