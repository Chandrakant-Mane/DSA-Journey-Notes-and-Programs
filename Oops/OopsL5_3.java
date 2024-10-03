package Oops;

// Exposing the set of services but hiding the internal implementaion 
abstract class Bird{
    public abstract void fly() ;
    public abstract void eat() ;
}

class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow fly @short height");
    }
    public void eat(){
        System.out.println("Sparrow eat grains...");
    }
}

abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle fly @very very height");
    }
    public abstract void eat() ;
}

class SerpentEagle extends Eagle{
    public void eat(){
        System.out.println("Serpent eagle eats snakes...");
    }
}

class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden eagle catches prey over the odean...");
    }
}

class Crow extends Bird{
    public void fly(){
        System.out.println("Crow fly @medium height...");
    }
    public void eat(){
        System.out.println("Crow eat grains...");
    }
}

class Sky{
    public void allowBird(Bird ref){
        ref.fly(); 
        ref.eat(); 
        System.out.println();
    }
}
public class OopsL5_3 {
    public static void main(String[] args) {
        Sky sky = new Sky() ;
        sky.allowBird(new Sparrow());
        sky.allowBird(new SerpentEagle());
        sky.allowBird(new GoldenEagle());
        sky.allowBird(new Crow());

    }
}
