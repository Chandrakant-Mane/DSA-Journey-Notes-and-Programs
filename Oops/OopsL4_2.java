package Oops;

class Animal{
    public void eat(){
        System.out.println("Animal is Eating...");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping...");
    }
}

class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey Steals And Eats...");
    }
    public void sleep(){
        System.out.println("Monkey  is Sleeping...");
    }
}

class Deer extends Animal{
    public void eat(){
        System.out.println("Deer Graze And Eats...");
    }
    public void sleep(){
        System.out.println("Deer is Sleeping...");
    }
}

class Lion extends Animal{
    public void eat(){
        System.out.println("Lion Hunts And Eats...");
    }
    public void sleep(){
        System.out.println("Lion is Sleeping...");
    }
}

class Forest{
    public void allowAnimal(Animal a){
        a.eat();
        a.sleep(); 
        System.out.println();
    }
}

public class OopsL4_2 {
    // public static void main(String[] args) {
    //     Animal a = null ;
    //     a = new Monkey() ;
    //     a.eat(); 
    //     a.sleep();
    //     System.out.println();
    //     a = new Deer() ;
    //     a.eat();
    //     a.sleep();
    //     System.out.println();
    //     a = new Lion() ;
    //     a.eat() ;
    //     a.sleep();
    // }

    public static void main(String[] args) {
        Forest f = new Forest() ;
        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }

    
}
