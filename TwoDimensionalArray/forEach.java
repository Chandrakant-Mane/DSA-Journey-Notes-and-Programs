package TwoDimensionalArray;

public class forEach {
    public static void main(String[] args) {
        int[] a = {4,7,2,8};
        for(int ele : a){
            System.out.print(ele + " ");
        }
        System.out.println();

        // 1 2 3 
        // 4 5 6 
        int[][] b = {{1,2,3} ,{4,5,6 }};
        // For Each 
        for(int[] ele : b){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }


        // // Output of 2D Array 
        // for(int i = 0 ; i < 2 ; i++){        // Rows 
        //     for(int j = 0 ; j < 3 ; j++){    // Cols
        //         System.out.print(b[i][j] +  " ");
        //     }
        //     System.out.println();
        // }


    }
    
}
