package Oops;

abstract class Plane2{
    public abstract void takeoff() ;
    public abstract void fly() ;
    public abstract void land() ;
}

class CargoPlane1 extends Plane2{
    public void takeoff(){
        System.out.println("CargoPlane tookoff...");
    }
    public void fly(){
        System.out.println("CargoPlane flying...");
    }
    public void land(){
        System.out.println("CargoPlane landing...");
    }
}

class PassengerPlane1 extends Plane2{
    public void takeoff(){
        System.out.println("PassengerPlane tookoff...");
    }
    public void fly(){
        System.out.println("PassengerPlane flying...");
    }
    public void land(){
        System.out.println("PassengerPlane landing...");
    }
}

class FighterPlane1 extends Plane2{
    public void takeoff(){
        System.out.println("FighterPlane tookoff...");
    }
    public void fly(){
        System.out.println("FighterPlane flying...");
    }
    public void land(){
        System.out.println("FighterPlane landing...");
    }
}

class Airport1{
    public void allowPlane(Plane2 ref){
        ref.takeoff(); 
        ref.fly(); 
        ref.land(); 
        System.out.println();
    }
}

public class OopsL5_1 {
    public static void main(String[] args) {
        Airport1 a = new Airport1() ;
        a.allowPlane(new PassengerPlane1());
        a.allowPlane(new FighterPlane1());
        a.allowPlane(new CargoPlane1()) ;
    }
}
