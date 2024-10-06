package Oops;

class Animal1{}
class Monkey1 extends Animal1{

}
class AnimalApp{
    public void m1(Monkey1 m){
        System.out.println("Monkey version...");
    }
    public void m1(Animal1 a){
        System.out.println("Animal version...");
    }
}

public class Test1_2 {
    public static void main(String[] args) {
        AnimalApp a = new AnimalApp() ;
        Monkey1 m = new Monkey1() ;
        a.m1(m) ; // m(Monkey) ---->  Monkey

        Animal1 animal = new Animal1() ;
        a.m1(animal) ; //animal ----> Animal

        // Parent obj = new Child() ;   Valid 
        Animal1 an = new Monkey1() ;
        a.m1(an) ; // an(Animal) ----> Animal 
    }
}
