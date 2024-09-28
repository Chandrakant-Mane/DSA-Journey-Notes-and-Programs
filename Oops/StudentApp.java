package Oops;

class Student{

        // Data - Security 
        private int rollNo;
        private String name ;
        private String address ;
         
        // Setter Methods 
        public void setRollNo(int rollNo){
            this.rollNo = rollNo ;
        }
        public void setName(String name){
            this.name = name ;
        }
        public void setaddress(String address){
            this.address = address  ;
        }

        // Getter Method 
        public int getRollNo(){
            return rollNo ;
        }
        public String getName(){
            return name ;
        }
        public String getAddress(){
            return address ;
        }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student() ;

        // Calling Setter Methods 
        s1.setRollNo(10);
        s1.setName("Chandrakant");
        s1.setaddress("Mumbai");

        // Calling Getter Methods 
        System.out.println("RollNO     is  : : " + s1.getRollNo());
        System.out.println("Name       is  : : " + s1.getName());
        System.out.println("Address    is  : : " + s1.getAddress());
    }
    
}
