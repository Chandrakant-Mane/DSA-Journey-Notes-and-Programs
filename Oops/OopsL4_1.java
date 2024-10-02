package Oops;

class Plane1{
    public void takeoff(){
        System.out.println("Plane Tookoff...");
    }
    public void fly(){
        System.out.println("Plane is Flying...");
    }
    public void land(){
        System.out.println("Plane is Landing...");
    }
}

class PassengerPlane extends Plane1{
    public void takeoff(){
        System.out.println("PassengerPlane Tookoff...");
    }
    public void fly(){
        System.out.println("PassengerPlane is Flying...");
    }
    public void land(){
        System.out.println("PassengerPlane is Landing");
    }
}

class CargoPlane extends Plane1{
    public void takeoff(){
        System.out.println("CargoPlane Tookoff...");
    }
    public void fly(){
        System.out.println("CargoPlane is Flying...");
    }
    public void land(){
        System.out.println("CargoPlane is Landing...");
    }
}

class FighterPlane extends Plane1{
    public void takeoff(){
        System.out.println("FighterPlane Tookoff...");
    }
    public void fly(){
        System.out.println("FighterPlane is Flying...");
    }
    public void land(){
        System.out.println("FighterPlane is Landing...");
    }
}

class Airport{
    // TruePolymorphism 
    public void allowPlane(Plane1 p){
        p.takeoff() ;
        p.fly() ;
        p.land() ;
        System.out.println();
    }
}

public class OopsL4_1 {
    // public static void main(String[] args) {
    //     Plane1 p = null ;
    //     p = new PassengerPlane() ;
    //     p.takeoff(); 
    //     p.fly();
    //     p.land() ;

    //     System.out.println();

    //     p = new CargoPlane() ;
    //     p.takeoff(); 
    //     p.fly();
    //     p.land() ;

    //     System.out.println();

    //     p = new FighterPlane() ;
    //     p.takeoff() ; 
    //     p.fly(); 
    //     p.land();
    // }

    public static void main(String[] args) {
        PassengerPlane p = new PassengerPlane() ;
        CargoPlane c = new CargoPlane() ;
        FighterPlane f = new FighterPlane() ;

        Airport a = new Airport() ;
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);
    }
}
