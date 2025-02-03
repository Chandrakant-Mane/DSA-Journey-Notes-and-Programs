public class ToStringInJava {
    static class Laptop { // Every class In Java by default Extends the Objects Class .
        String model;
        int price;

        public String toString(){
            return model + " : " + price ;
        }

        public boolean equals(Laptop that){
            return (this.model.equals(that.model) && this.price == that.price) ;
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            result = prime * result + price;
            return result;
        }
    }
    public static void main(String[] args) {
        Laptop obj1 = new Laptop() ;
        obj1.model = new String("Asus Vivobook") ;
        obj1.price = 1000 ;

        System.out.println(obj1); // By default it call toString method of Superclass(Object) .
        // So if use toString method then you can return the values which you want to return 
        // Else it will returns the values of by default toString method which is in SuperClass(Object)


        Laptop obj2 = new Laptop();
        obj2.model = new String("Asus Vivobook");
        obj2.price = 1000;

        System.out.println(obj2);

        boolean result = obj1.equals(obj2) ;
        System.out.println(result);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


        System.out.println(obj1.model == obj2.model);
        System.out.println(obj1.model.equals(obj2.model));
    }
}
