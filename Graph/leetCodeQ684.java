package Graph;

public class leetCodeQ684 {
    static int[] parent;
    static int[] size;

    public static int leader(int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = leader(parent[a]);
    }

    public static void union(int a, int b) {
        a = leader(a);
        b = leader(b);
        if (a != b) {
            if (size[a] > size[b]) {
                parent[b] = a;
                size[a] += size[b];
            } else {
                parent[a] = b;
                size[b] += size[a];
            }
        }

    }

    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        int[] ans = new int[2];
        for (int[] arr : edges) {
            int u = arr[0], v = arr[1];
            if (leader(u) == leader(v)) { // Cycle detected
                ans[0] = u;
                ans[1] = v;
                break;
            } else
                union(u, v);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 1, 5 } };
        int[] ans = findRedundantConnection(edges);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
