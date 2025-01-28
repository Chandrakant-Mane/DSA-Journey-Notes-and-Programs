package Backtracking;

import java.util.ArrayList;

public class ratInMaze {
    // Function to find all possible paths
    public static void solve(int i, int j, ArrayList<ArrayList<Integer>> a, int n, ArrayList<String> ans, String move,
            int[][] vis) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }

        // downward
        if (i + 1 < n && vis[i + 1][j] == 0 && a.get(i + 1).get(j) == 1) {
            vis[i][j] = 1;
            solve(i + 1, j, a, n, ans, move + 'D', vis);
            vis[i][j] = 0;
        }

        // left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && a.get(i).get(j - 1) == 1) {
            vis[i][j] = 1;
            solve(i, j - 1, a, n, ans, move + 'L', vis);
            vis[i][j] = 0;
        }

        // right
        if (j + 1 < n && vis[i][j + 1] == 0 && a.get(i).get(j + 1) == 1) {
            vis[i][j] = 1;
            solve(i, j + 1, a, n, ans, move + 'R', vis);
            vis[i][j] = 0;
        }

        // upward
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && a.get(i - 1).get(j) == 1) {
            vis[i][j] = 1;
            solve(i - 1, j, a, n, ans, move + 'U', vis);
            vis[i][j] = 0;
        }

    }

    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int n = mat.size();
        int[][] vis = new int[n][n];
        ArrayList<String> ans = new ArrayList<>();
        if (mat.get(0).get(0) == 1)
            solve(0, 0, mat, n, ans, "", vis);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>() ;
        ArrayList<Integer> l1 = new ArrayList<>() ;
        l1.add(1) ;     l1.add(0) ;     
        l1.add(0);      l1.add(0);
        ArrayList<Integer> l2 = new ArrayList<>() ;
        l2.add(1) ;     l2.add(1); 
        l2.add(0);      l2.add(1); 
        ArrayList<Integer> l3 = new ArrayList<>() ;
        l3.add(1) ;     l3.add(1) ;
        l3.add(0) ;     l3.add(0) ;
        ArrayList<Integer> l4 = new ArrayList<>() ;
        l4.add(0) ;     l4.add(1) ;
        l4.add(1) ;     l4.add(1) ;

        mat.add(l1) ;   mat.add(l2) ;   mat.add(l3) ;   mat.add(l4) ;
        System.out.println(mat);

        System.out.println(findPath(mat));
    }
}
