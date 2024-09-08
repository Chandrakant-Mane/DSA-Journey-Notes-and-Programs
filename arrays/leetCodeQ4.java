package arrays;

public class leetCodeQ4 {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81,90,100};
        int n = a.length + b.length;
        int[] c = new int[n];
        // for(int ele : c){
        //     System.out.print(ele + " ");
        // }

        int i = 0 , j = 0 , k = 0 ;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++; k++;
            }
            else {
                c[k] = b[j];
                j++; k++;
            }
        }
        if(i == a.length){
            while(j<b.length){
                c[k] = b[j];
                j++ ; k++ ;
            }
        }
        if(j == b.length){
            while(i<a.length){
                c[k] = a[i];
                i++ ; k++ ;
            }
            
        }

        for(int ele : c){
            System.out.print(ele + " ");
        }

        

    }
}
