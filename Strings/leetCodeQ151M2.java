package Strings;

public class leetCodeQ151M2 {
    public static void main(String[] args) {
        String s =  "the sky is blue" ;
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != "") {
                if (res.length() == 0) {
                    res.append(arr[i]);
                } else {
                    res.append(" ");
                    res.append(arr[i]);
                }
            }
        }
        System.out.println(res.toString());
    }
}
