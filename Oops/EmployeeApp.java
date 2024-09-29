package Oops;

class Employee{
    // Data Secuity 
    private String eid ;
    private String ename ;
    private int eage ;
    private String eaddress ;

    // Setter Methods 
    public void setEid(String eid){
        this.eid = eid ;
    }
    public void setEname(String ename){
        this.ename = ename ;
    }
    public void setEage(int eage){
        this.eage = eage ;
    }
    public void setEaddress(String eaddress){
        this.eaddress = eaddress ;
    }

    // Getter Methods
    public String getEid(){
        return eid ;
    }
    public String getEname(){
        return ename ;
    }
    public int getEage(){
        return eage;
    }
    public String getEaddress(){
        return eaddress ;
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee() ;

        // Calling Setter Method 
        e1.setEid("24") ;
        e1.setEname("Chandrakant") ;
        e1.setEage(20) ;
        e1.setEaddress("Mumbai") ;

        // Calling Getter Method 
        System.out.println("Eid       is : : " + e1.getEid());
        System.out.println("Ename     is : : " + e1.getEname());
        System.out.println("Eage      is : : " + e1.getEage());
        System.out.println("Eaddress  is : : " + e1.getEaddress());
    }
    
}
