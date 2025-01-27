package Backtracking ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetCodeQ51 {
    public static List<String> makeString(char[][] board){
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static boolean isSafe(char[][] board , int row , int col){
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
    public static void queen(char[][] board , int col , List<List<String>> res ){
        if (col == board.length) {
            res.add(makeString(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                queen(board , col + 1, res);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.' ;
            }
        }
        List<List<String>> ans = new ArrayList<>() ;
        queen(board , 0 , ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(solveNQueens(n));
    }
}
