package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno ;
    double perc ;
    String name ;

    Student(int rno , double perc , String name){
        this.name = name ;
        this.rno = rno ;
        this.perc = perc ;
    }
    public int compareTo(Student s){
        return (this.name.charAt(0) - s.name.charAt(0)) ;
    }
}

public class customComparator {
    public static void print(Student[] arr){
        for(Student ele : arr){
            System.out.print(ele.name + " ");
            System.out.print(ele.rno + " ");
            System.out.println(ele.perc + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Student[] s = new Student[4] ;
        s[0] = new Student(76, 89.5, "Raghav") ;
        s[1] = new Student(88, 78.1, "Prachi") ;
        s[2] = new Student(13, 95.8, "Amrit") ;
        s[3] = new Student(83, 50.3, "Himanshu") ;

        print(s) ;

        Arrays.sort(s);

        print(s);

    }
}
