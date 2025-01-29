import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorVSComparable {
    static class Student implements Comparable<Student>{
        int age ;
        String name ; 

        public Student(int age , String name){
            this.age = age ; 
            this.name = name ;
        }

        public String toString(){
            return "Student [ ane : " + age + " , name : " + name + " ]" ;
        }

        public int compareTo(Student that){
            return this.name.length() - that.name.length() ;
        }
        Comparator<Student> comStud = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1; // It will swap
                else
                    return -1; // It will Not swap
            }
        };
    }
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i , Integer j){
                if(i%10 > j%10)
                    return 1 ; // It will swap 
                else 
                    return -1 ; // It will Not swap
            }
        };
        Comparator<String> comStr = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length())
                    return 1; // It will swap
                else
                    return -1; // It will Not swap
            }
        };

        
        List<Integer> nums = new ArrayList<>() ;
        nums.add(43) ;
        nums.add(31) ;
        nums.add(72) ;
        nums.add(29) ;

        Collections.sort(nums , com) ;

        System.out.println(nums);

        List<String> str = new ArrayList<>() ;
        str.add("Mahesh") ;
        str.add("Vinayak") ;
        str.add("Chandrakant") ;
        str.add("Om") ;
        str.add("Shree") ;
        Collections.sort(str, comStr) ;

        System.out.println(str);

        List<Student> stud = new ArrayList<>() ;
        stud.add(new Student(18, "Chandrakant")) ;
        stud.add(new Student(25, "Vinayak")) ;
        stud.add(new Student(22, "Mahesh")) ;
        stud.add(new Student(30, "Om")) ;
        stud.add(new Student(28, "Shree")) ;

        Student s1 = new Student(0, null) ;

        Collections.sort(stud , s1.comStud) ;

        for (Student s : stud) {
            System.out.println(s);
        }


        System.out.println();
        System.out.println();
        Collections.sort(stud);

        for(Student s : stud){
            System.out.println(s);
        }


    }
}
