package Queue;

public class leetCodeQ1700 {
    public static void main(String[] args) {
        int[] students = { 1, 1, 1, 0, 0, 1 } ;
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 } ;

        int ones = 0;
        int zeroes = 0;

        for (int stud : students) {
            if (stud == 0)
                zeroes++;
            else
                ones++;
        }
        boolean flag = false ;
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeroes == 0){
                    System.out.println(ones);
                    flag = true ;
                    break ;
                }
                else
                    zeroes--;
            } 
            else if (sandwich == 1) {
                if (ones == 0){
                    System.out.println(zeroes);
                    flag = true ;
                    break ;
                }
                else
                    ones--;
            }
        }

        if(flag == false) System.out.println(0);
    }
}
