package arrays;

public class leetCodeQ4M2 {
    public static void main(String[] args) {
        int[] a = {11,33,42,71,91,94};
        int m = a.length;
        int[] b = {26,54,69,81};
        int n = b.length;
        int[] c = new int[m+n];

        int i = m-1 , j = n-1, k = c.length-1; 
        while(i > -1 && j > -1){
            if(a[i] >= b[j]){
                c[k] = a[i];
                i--;
                k--;}
            else{
                c[k] = b[j];
                j--;
                k--;
            }
        }

        if(i < 0){
            while(j>=0){
                c[k] = b[j];
                j-- ; k-- ;
            } 
        }
        if(j < 0){
            while(i>=0){
                c[k] = a[i];
                i-- ; k-- ;
            }
        }

        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
    
}
