package Strings;

public class leetCodeQ151M3 {
    public static void main(String[] args) {
        String s = "the sky is blue" ;

        StringBuilder res = new StringBuilder();
        int sIdx = s.length() - 1;

        while (sIdx >= 0) {
            while (sIdx >= 0 && s.charAt(sIdx) == ' ')
                sIdx--;
            if (sIdx < 0)
                break;
            int endIdx = sIdx;

            while (sIdx >= 0 && s.charAt(sIdx) != ' ')
                sIdx--;

            if (res.length() == 0) {
                res.append(s.substring(sIdx + 1, endIdx + 1));
            } else {
                res.append(" ");
                res.append(s.substring(sIdx + 1, endIdx + 1));
            }

        }
        System.out.println(res.toString());
    }
}
