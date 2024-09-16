package CyclicSort;

public class leetCodeQ268M2 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length ;
        boolean[] b = new boolean[n+1] ;
        for(int ele : nums){
            b[ele] = true ;
        }
        for (int i = 0; i <= n; i++) {
            if(b[i] == false) System.out.print(i); 
        }
        
    }
}
