package arrays;

public class secondmax {
    public static void main(String[] args) {

       // Method - 2
       int[] arr = {23,34,53,56,63,64,34,34,2,25,-45};
       int n = arr.length;
       int mx = Integer.MIN_VALUE;
       for(int i=0; i<n; i++){
        //    if(arr[i]>mx) mx = arr[i];
           mx = Math.max(mx, arr[i]);
       }

       int smx = Integer.MIN_VALUE;
       for(int i=0 ; i<n ; i++){
      //   if(arr[i]>smx && arr[i]!=mx) smx = arr[i];
        if(arr[i] != mx)
        smx = Math.max(smx, arr[i]);
       }
       System.out.println(smx);
    }
}
