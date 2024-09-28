package Oops;

class Account {

    // Data Security
    private double balance;

    // Methods : : public
    public double getBalance(double balance) {
        // Perform Authentication
        boolean result = validate("sachin", "sachin123");

        // withdrawing the money
        if (result == true) {
            this.balance = this.balance - balance;
            return balance;
        } else {
            // throw a meaningful message to the user
            System.out.println("Invalid username / password try again...");
            return 0.0;
        }
    }

    // Methods : : public 
    public void setBalance(double balance){
        // perform Authentication 
        boolean  result = validate("sachin" , "sachin123") ;

        if(result == true){
            // Deposit The Money 
            this.balance = this.balance + balance ;
            System.out.println("Credited to the account ");
        }
        else{
            // Throw A Meaningful Message To The User 
            System.out.println("Invalid Username / Password Try Again...");
        }
    }

    // Method : : private 
    private boolean validate(String userName , String password){
        // Logic for Authentication 
        return userName.equalsIgnoreCase("sachin") && password.equals("sachin123") ;
    }
}


public class TestApp {
    public static void main(String[] args) {
        Account acc = new Account() ;
        acc.setBalance(1000.0);

        double balance = acc.getBalance(500) ;
        System.out.println("Witdrawing : : " + balance + "Amount");
    }

}
