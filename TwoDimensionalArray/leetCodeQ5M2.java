package TwoDimensionalArray;

public class leetCodeQ5M2 {
    public static void main(String[] args) {
        // int[][] arr = { {1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} , {16,17,18,19,20} , {21,22,23,24,25} , {26,27,28,29,30}};
        int[][] arr = { {1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} } ;
        int m = arr.length , n = arr[0].length;
            // Spiral Print
        int minr = 0 , maxr = m-1 ;
        int minc = 0 , maxc = n-1 ;
        
        while (minr<=maxr && minc<=maxc) {
            // Left to right 
            for(int j=minc ; j<=maxc ; j++){
                System.out.print(arr[minr][j] + " " );
            } minr++;

            // Top To bottom
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            } maxc--;
            
            // Right To Left 
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc ; j >= minc ; j--){
                System.out.print(arr[maxr][j] + " ");
            } maxr--;

            // Bottom To Top 
            if(minr>maxr || minc>maxc) break;
            for(int i = maxr ; i >= minr ; i--){
                System.out.print(arr[i][minc] + " ");
            } minc++;
            
        }
    }
    
}
