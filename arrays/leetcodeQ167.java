package arrays;

public class leetcodeQ167 {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int x = 6 ;
        int[] ans = new int[2] ;
        int i = 0 , j = arr.length-1 ;
        while(i<=j){
            if(arr[i] + arr[j] == x){
                ans[0] = i+1 ;
                ans[1] = j+1 ;
                System.out.print(ans[0]+" ");
                System.out.println(ans[1]+" ");
                break ;
            }
            if(arr[i] + arr[j] > x ){
                j--;
            }
            else if(arr[i] + arr[j] < x)
                i++ ;
        }
        System.out.print(ans[0]+" ");
        System.out.println(ans[1]+" ");
        
    }
    
}
