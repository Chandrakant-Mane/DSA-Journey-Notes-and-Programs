package Oops;

public class inheritanceHasA {
    static class Name{
        String FirstName ;
        String MiddleName ;
        String LastName ;

        public Name(String fname , String mname , String lname){
            this.FirstName = fname ;
            this.MiddleName = mname ;
            this.LastName = lname ;
        }
    }

    static class EmployeeExam{
        int age ;
        Name n ;
        public EmployeeExam(int age , Name n){
            this.age = age ;
            this.n = n ;
        }
        public void display(){
            System.out.println("Age : " + age);
            System.out.println("Full Name : " + n.FirstName + " " + n.MiddleName + " " + n.LastName);
        }
        
    }
    public static void main(String[] args) {
        Name n = new Name("Chandrakant", "Krishna", "Mane")  ;
        Name n1 = new Name("Chandrakant", "Krishna", "Mane")  ;

        EmployeeExam e = new EmployeeExam(20 , n) ;
        EmployeeExam e1 = new EmployeeExam(30 , n1) ;

        e.display();
        e1.display();
    }
}
