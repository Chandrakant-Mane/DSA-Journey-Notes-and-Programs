package Oops;

class Animal{}
class Monkey extends Animal{

}
class AnimalApp{
    public void m1(Monkey m){
        System.out.println("Monkey version...");
    }
    public void m1(Animal a){
        System.out.println("Animal version...");
    }
}

public class Test1_2 {
    public static void main(String[] args) {
        AnimalApp a = new AnimalApp() ;
        Monkey m = new Monkey() ;
        a.m1(m) ; // m(Monkey) ---->  Monkey

        Animal animal = new Animal() ;
        a.m1(animal) ; //animal ----> Animal

        // Parent obj = new Child() ;   Valid 
        Animal an = new Monkey() ;
        a.m1(an) ; // an(Animal) ----> Animal 
    }
}
