package Linked_List;

import java.util.Arrays;

public class leetCodeQ2326 {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n] ;
        for(int i = 0 ; i < m ; i++){
            Arrays.fill(matrix[i] , -1) ;
        }

        int topRow = 0 , bottomRow = m-1 , leftCol = 0 , rightCol = n-1 ;
        while(head != null){
            for(int col = leftCol ; col <= rightCol ; col++){
                if(head == null) break ;
                matrix[topRow][col] = head.val ;
                head = head.next ;
            }
            topRow++ ;

            for(int row = topRow ; row <= bottomRow ; row++){
                if(head == null) break ;
                matrix[row][rightCol] = head.val ;
                head = head.next ;
            }
            rightCol-- ;

            for(int col = rightCol ; col >= leftCol ; col--){
                if(head == null) break ;
                matrix[bottomRow] [col] = head.val ;
                head = head.next ;
            }
            bottomRow-- ;

            for(int row = bottomRow ; row >= topRow ; row--){
                if(head == null) break ;
                matrix[row][leftCol] = head.val ;
                head = head.next ;
            }
            leftCol++ ;
        }
        return matrix ;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(3) ;
        ListNode b = new ListNode(0) ;
        ListNode c = new ListNode(2) ;
        ListNode d = new ListNode(6) ;
        ListNode e = new ListNode(8) ;
        ListNode f = new ListNode(1) ;
        ListNode g = new ListNode(7) ;
        ListNode h = new ListNode(9) ;
        ListNode i = new ListNode(2) ;
        ListNode j = new ListNode(5) ;
        ListNode k = new ListNode(5) ;
        ListNode l = new ListNode(0) ;

        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;
        g.next = h ;
        h.next = i ;
        i.next = j ;
        j.next = k ;
        k.next = l ;
        int m = 3 , n = 5 ;
        int[][] ans = spiralMatrix(m, n, a) ;

        for(int x = 0 ; x < m ; x++){
            for(int y = 0 ; y < n ; y++){
                System.out.print(ans[x][y] + " ");
            }
        }
    }
}
